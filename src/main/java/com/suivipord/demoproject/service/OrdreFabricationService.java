package com.suivipord.demoproject.service;

import com.suivipord.demoproject.entity.OrdreFabrication;
import com.suivipord.demoproject.repository.OrdreFabricationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class OrdreFabricationService {
    @Autowired
    OrdreFabricationRepository ordreFabricationRepository ;

    public OrdreFabrication ajouterOf(OrdreFabrication o){
        return ordreFabricationRepository.save(o);
    }

    public OrdreFabrication modifierOf(OrdreFabrication o){
        return ordreFabricationRepository.save(o);
    }

    public void supprimerOf(Long idOf){
        ordreFabricationRepository.deleteById(idOf);
    }

    public List<OrdreFabrication> afficherTtOf (){

        return ordreFabricationRepository.findAll();
    }
}
