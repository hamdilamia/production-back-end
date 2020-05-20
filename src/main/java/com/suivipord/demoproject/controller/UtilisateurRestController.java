package com.suivipord.demoproject.controller;

import com.suivipord.demoproject.entity.Utilisateur;
import com.suivipord.demoproject.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suiviProd/utilisateur")
@CrossOrigin(origins="*")
public class UtilisateurRestController {
    @Autowired
    UtilisateurService utilisateurService;
    @PostMapping("/add")
    public Utilisateur add(@RequestBody Utilisateur p){
        return utilisateurService.ajoutUser(p);
    }


    @PutMapping ("/update")
    public Utilisateur update(@RequestBody Utilisateur p){
        return utilisateurService.modifierUser(p);
    }

    @GetMapping("/getAll")
    public List<Utilisateur> getAll(){
        return utilisateurService.afficherTtUser();
    }


    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable Long id){
        utilisateurService.supprimerUser(id);
    }

}
