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
Long cin;
String nom;
String prenom;
String email;
Date dateNaissance;
Date dateIscription;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getCin() {
        return cin;
    }

    public void setCin(Long cin) {
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateIscription() {
        return dateIscription;
    }

    public void setDateIscription(Date dateIscription) {
        this.dateIscription = dateIscription;
    }
}
