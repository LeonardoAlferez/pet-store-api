package com.example.petstoreapi.service;

import com.example.petstoreapi.model.entity.Pets;
import com.example.petstoreapi.repository.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
/* Our PetsRepository Service*/
@Service
public class PetsService {
    @Autowired
    PetsRepository petsRepository;

    //Return a pet list
    public ArrayList<Pets> listPets(){
        return (ArrayList<Pets>) petsRepository.findAll();
    }
    //Create and update our pet (in this case, we won't be able to update because our request doesn't include ID)
    public Pets createPets(Pets pets){
        return petsRepository.save(pets);
    }
    //Return an optional<Pets> if found or not, a pet
    public Optional<Pets> showPetById(int id){
        return petsRepository.findById(id);
    }

}
