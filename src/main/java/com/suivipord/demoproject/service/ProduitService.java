package com.suivipord.demoproject.service;

import com.suivipord.demoproject.entity.Produit;
import com.suivipord.demoproject.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class ProduitService {
    @Autowired
    ProduitRepository produitRepository;

    public Produit ajouterProduit(Produit p){
        return produitRepository.save(p);
    }

    public Produit modifierProduit(Produit p){
        return produitRepository.save(p);
    }

    public void supprimerProduit(Long id){
        produitRepository.deleteById(id);
    }

    public List<Produit> afficherTtProduit (){

        return produitRepository.findAll();
    }
}
