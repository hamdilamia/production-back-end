package com.suivipord.demoproject;

import com.suivipord.demoproject.entity.Produit;
import com.suivipord.demoproject.entity.Utilisateur;
import com.suivipord.demoproject.repository.ProduitRepository;
import com.suivipord.demoproject.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;

//samer
@SpringBootApplication
public class DemoprojectApplication implements CommandLineRunner {

    @Autowired
    /*UtilisateurRepository utilisateurRepository;*/
    ProduitRepository produitRepository;

    public static void main(String[] args) {
        try{
            SpringApplication.run(DemoprojectApplication.class, args);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(String... args0) throws Exception {
        /*Utilisateur u1 = new Utilisateur();
        u1.setNom("Hamdi");
        u1.setPrenom("Lamia");
        u1.setCin("12345678");
        u1.setDateNaissance("13/11/97");
        u1.setDateIscription("24/04/20");
        utilisateurRepository.save(u1);

        Utilisateur u2 = new Utilisateur();
        u2.setNom("Hassine");
        u2.setPrenom("anghame");
        u2.setCin("12345679");
        u2.setDateNaissance("28/08/98");
        u2.setDateIscription("24/04/20");
        utilisateurRepository.save(u2);

        Utilisateur u3= utilisateurRepository.getUtilisateurByCin("12345678");
        if(u3 != null){
            System.out.println("exist");
            System.out.println("Nom:"+u3.getNom());
            System.out.println("Prenom:"+u3.getPrenom());
            System.out.println("CIN:"+u3.getCin());
        }
        else{
            System.out.print("n'exist pas");
        }*/


        Produit p1=new Produit("00ff36","chemise X");
        produitRepository.save(p1);
        Produit p2=new Produit("00ff38","robe Y");
        produitRepository.save(p2);


        Produit p3= produitRepository.getProduitByRef("00ff23");
        if(p3 != null){
            System.out.println("exist");
            System.out.println("Reference:"+p3.getRef());
            System.out.println("designation:"+p3.getDesignation());
        }
        else{
            System.out.print("n'exist pas");
        }



    }
}
