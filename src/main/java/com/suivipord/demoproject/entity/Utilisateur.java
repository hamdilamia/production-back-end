package com.suivipord.demoproject.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table
public class Utilisateur implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
Long idUser;
String cin;
String nom;
String prenom;
String email;
String dateNaissance;
String dateIscription;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getCin() { return cin; }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getDateIscription() {
        return dateIscription;
    }

    public void setDateIscription(String dateIscription) {
        this.dateIscription = dateIscription;
    }
}
