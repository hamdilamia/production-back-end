package com.suivipord.demoproject.controller;

import com.suivipord.demoproject.entity.Produit;
import com.suivipord.demoproject.entity.Utilisateur;
import com.suivipord.demoproject.service.ProduitService;
import com.suivipord.demoproject.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suiviProd/produit")
@CrossOrigin(origins="*")

public class ProduitRestController {
    @Autowired
    ProduitService produitService;
    @PostMapping("/add")
    public Produit add(@RequestBody Produit p){
        return produitService.ajouterProduit(p);
    }


    @PutMapping ("/update")
    public Produit update(@RequestBody Produit p){
        return produitService.modifierProduit(p);
    }

    @GetMapping("/getAll")
    public List<Produit> getAll(){
        return produitService.afficherTtProduit();
    }


    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable Long id){
        produitService.supprimerProduit(id);
    }
}
