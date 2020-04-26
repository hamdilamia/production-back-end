package com.suivipord.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.suivipord.demoproject.entity.Utilisateur;

import java.util.Collection;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
    public Utilisateur getUtilisateurByCin(String cin);
    @Query("SELECT u FROM Utilisateur u WHERE u.nom= :nom")
    Collection<Utilisateur> findAllByNom(@Param("nom") String nom);

}
