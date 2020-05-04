package com.suivipord.demoproject.repository;

import com.suivipord.demoproject.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    public Produit getProduitByRef(String ref);
    @Query("SELECT p FROM Produit p WHERE p.ref= :ref")
    Collection<Produit> findAllByRef(@Param("ref") String ref);
}
