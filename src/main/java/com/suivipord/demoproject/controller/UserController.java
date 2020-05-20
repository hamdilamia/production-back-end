package com.suivipord.demoproject.controller;

import com.suivipord.demoproject.entity.UserDTO;
import com.suivipord.demoproject.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    @Autowired
    private JwtUserDetailsService userDetailsService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody UserDTO user) throws Exception {
        return ResponseEntity.ok(userDetailsService.enregistrer(user));
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/Users", method = RequestMethod.GET)
    public ResponseEntity<?> getUser() throws Exception {
        return ResponseEntity.ok(userDetailsService.afficherTtCompte());
    }

    @RequestMapping(value = "/User", method = RequestMethod.GET)
    public ResponseEntity<?> getUserById(@RequestParam Integer id) throws Exception {
        return ResponseEntity.ok(userDetailsService.afficherCompteParId(id));
    }

    @RequestMapping(value = "/UserDelete", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@RequestParam Integer id) throws Exception {
        return ResponseEntity.ok(userDetailsService.supprimerCompte(id));
    }

    @RequestMapping(value = "/UpdateUser", method = RequestMethod.PUT)
    public ResponseEntity<?> UpdateUser(@RequestBody UserDTO user) throws Exception {
        return ResponseEntity.ok(userDetailsService.modifierCompte(user));
    }
}
