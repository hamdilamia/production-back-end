package com.suivipord.demoproject.controller;

import com.suivipord.demoproject.entity.OrdreFabrication;
import com.suivipord.demoproject.service.OrdreFabricationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suiviProd/ordreFabrication")
@CrossOrigin(origins="*")

public class OrdreFabricationRestController {
    @Autowired
    OrdreFabricationService ordreFabricationService;
    @PostMapping("/add")
    public OrdreFabrication add(@RequestBody OrdreFabrication p){
        return ordreFabricationService.add(p);
    }


    @PutMapping ("/update")
    public OrdreFabrication update(@RequestBody OrdreFabrication p){
        return ordreFabricationService.update(p);
    }

    @GetMapping("/getAll")
    public List<OrdreFabrication> getAll(){
        return ordreFabricationService.getAll();
    }


    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable Long idOf){
        ordreFabricationService.delete(idOf);
    }
}
