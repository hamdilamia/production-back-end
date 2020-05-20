package com.suivipord.demoproject.controller;

import com.suivipord.demoproject.entity.Client;
import com.suivipord.demoproject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suiviProd/client")
@CrossOrigin(origins="*")
public class ClientController {
    @Autowired
    ClientService clientService;
    @PostMapping("/add")
    public Client add(@RequestBody Client c){
        return clientService.ajouterClient(c);
    }


    @PutMapping ("/update")
    public Client update(@RequestBody Client c){
        return
        clientService.modifierClient(c);
    }

    @GetMapping("/getAll")
    public List<Client> getAll(){
        return clientService.afficherTtClient();
    }


    @DeleteMapping ("/delete/{idClient}")
    public void delete(@PathVariable Long idClient){
        clientService.supprimerClient(idClient);
    }
}
