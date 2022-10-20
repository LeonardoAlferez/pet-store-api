package com.example.petstoreapi.repository;

import com.example.petstoreapi.model.entity.Pets;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/*Repo extends CRUDRepository that contains all Crud need*/
@Repository
public interface PetsRepository extends CrudRepository<Pets, Integer> {
}
