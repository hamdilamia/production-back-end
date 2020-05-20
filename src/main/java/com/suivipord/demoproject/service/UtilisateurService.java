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

    public Utilisateur ajoutUser(Utilisateur u){
        return utilisateurRepository.save(u);
    }

    public Utilisateur modifierUser(Utilisateur u){
        return utilisateurRepository.save(u);
    }

    public void supprimerUser(Long id){
        utilisateurRepository.deleteById(id);
    }

    public List<Utilisateur> afficherTtUser (){
        return utilisateurRepository.findAll();
    }


}
