package com.example.petstoreapi.controller;

import com.example.petstoreapi.model.entity.Pets;
import com.example.petstoreapi.service.PetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
//@RequestMapping("/pets")
public class PetsController {

    @Autowired
    PetsService petsService;
    /*
    * Get method that return a list of our pets
    * */
    @GetMapping(value = "/pets", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Pets> listPets(){
        return petsService.listPets();
    }
    /*
    * Get method that return a specific pet
    * */
    @GetMapping( path = "/pets/{petId}")
    public Optional<Pets> showPetById(@PathVariable("petId") int id){
        return this.petsService.showPetById(id);
    }
    /*
    * Post method that create a pet
    * */
    @PostMapping("/pets")
    public Pets createPets(@RequestBody Pets pets){
        return this.petsService.createPets(pets);
    }

}


