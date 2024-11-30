package hbe.fitness_zone.controler;

import hbe.fitness_zone.model.Client;
import hbe.fitness_zone.service.IClientService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ViewScoped  // AJAX request = Asynchronous JavaScript and XML
public class IndexControler {

    @Autowired
    IClientService clientService;
    private List<Client> clients;
    private Client selectedClient;
    private static final Logger logger = LoggerFactory.getLogger(IndexControler.class);

    @PostConstruct
    public void init(){
        loadingData();
    }

    public void loadingData() {
        this.clients = this.clientService.listAllClients();
        this.clients.forEach(client -> logger.info(client.toString()));
    }

    public void addClient() {
        this.selectedClient = new Client();
    }

    public void saveClient() {
        logger.info("Client to save: " + this.selectedClient);

        // adding client
        if(this.selectedClient.getId() == null) {
            this.clientService.saveClient(this.selectedClient);
            this.clients.add(this.selectedClient);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Client successfully added"));
        }

        // Modify (update) client
        else {
            this.clientService.saveClient(this.selectedClient);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Client Updated"));
        }

        // Hide the window modal
        PrimeFaces.current().executeScript("PF('windowModalClient').hide()");

        // Update table using AJAX
        PrimeFaces.current().ajax().update("form-clients:messages", "form-clients:table-clients");
        this.selectedClient = null;
    }

    public void deleteClient() {
        logger.info("Client to delete " + this.selectedClient);
        this.clientService.deleteClient(this.selectedClient);

         // Delete client from List in memory
        this.clients.remove(this.selectedClient);

        // Reset selected client object
        this.selectedClient = null;

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Client Deleted"));
        PrimeFaces.current().ajax().update("form-clients:messages", "form-clients:table-clients");
    }


    // JSF, Pimefaces, sping boot, JPA - Hybernate, MySQL


}
