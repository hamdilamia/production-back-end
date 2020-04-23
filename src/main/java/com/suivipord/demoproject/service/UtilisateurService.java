package com.suivipord.demoproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.suivipord.demoproject.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import com.suivipord.demoproject.entity.Utilisateur;

@Service
@Transactional
public class UtilisateurService {
    @Autowired
    UtilisateurRepository utilisateurRepository;

    public Utilisateur add(Utilisateur p){
        return utilisateurRepository.save(p);
    }

    public Utilisateur update(Utilisateur p){
        return utilisateurRepository.save(p);
    }

    public void delete(Long id){
        utilisateurRepository.deleteById(id);
    }

    public List<Utilisateur> getAll (){
        return utilisateurRepository.findAll();
    }


}
