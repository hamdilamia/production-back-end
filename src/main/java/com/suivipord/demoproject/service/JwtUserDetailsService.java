package com.suivipord.demoproject.service;

import com.suivipord.demoproject.repository.UserDao;
import com.suivipord.demoproject.entity.DAOUser;
import com.suivipord.demoproject.entity.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        DAOUser compte= userDao.findByUsername(username);
        if (compte == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(compte.getUsername(), compte.getPassword(),
                new ArrayList<>());
    }

    public DAOUser enregistrer(UserDTO user) {
        DAOUser newUser = new DAOUser();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        newUser.setRole(user.getRole());
        newUser.setEmail(user.getEmail());
        newUser.setNom(user.getNom());
        newUser.setPrenom(user.getPrenom());
        newUser.setCin(user.getCin());
        newUser.setDateIscription(user.getDateIscription());
        newUser.setDateNaissance(user.getDateNaissance());
        return userDao.save(newUser);
    }

    public List<DAOUser> afficherTtCompte() {

        return (List<DAOUser>) userDao.findAll();
    }

    public Optional<DAOUser> afficherCompteParId(Integer id) {
        // TODO Auto-generated method stub
        return userDao.findById(id);
    }

    public StringBuffer supprimerCompte (Integer id) {
        // TODO Auto-generated method stub
        userDao.deleteById(id);
        StringBuffer retBuf = new StringBuffer();
        retBuf.append("User data has been deleted successfully.");
        return retBuf;
    }

    public DAOUser modifierCompte (UserDTO user) {
        Optional<DAOUser> userA = userDao.findById(user.id);

        if(userA.isPresent())
        {
            DAOUser newEntity = userA.get();
            newEntity.setUsername(user.getUsername());
            newEntity.setPassword(user.getPassword());
            newEntity.setRole(user.getRole());
            newEntity.setEmail(user.getEmail());
            newEntity.setCin(user.getCin());
            newEntity.setNom(user.getNom());
            newEntity.setPrenom(user.getPrenom());
            newEntity.setDateNaissance(user.getDateNaissance());
            newEntity.setDateIscription(user.getDateIscription());

            newEntity = userDao.save(newEntity);

            return newEntity;
        }
        return null;
    }

}
