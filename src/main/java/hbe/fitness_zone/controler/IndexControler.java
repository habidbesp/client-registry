package hbe.fitness_zone.controler;

import hbe.fitness_zone.model.Client;
import hbe.fitness_zone.service.IClientService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
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
    private static final Logger logger = LoggerFactory.getLogger(IndexControler.class);

    @PostConstruct
    public void init(){
        loadingData();
    }

    public void loadingData() {
        this.clients = this.clientService.listAllClients();
        this.clients.forEach(client -> logger.info(client.toString()));
    }



}
