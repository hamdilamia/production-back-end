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

    public Produit add(Produit p){
        return produitRepository.save(p);
    }

    public Produit update(Produit p){
        return produitRepository.save(p);
    }

    public void delete(Long id){
        produitRepository.deleteById(id);
    }

    public List<Produit> getAll (){

        return produitRepository.findAll();
    }
}
