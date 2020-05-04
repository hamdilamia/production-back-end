package com.suivipord.demoproject.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduit;
    private String ref;
    private String designation;

    public Produit(){}
    public Produit(String ref, String designation) {
        this.ref = ref;
        this.designation = designation;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
