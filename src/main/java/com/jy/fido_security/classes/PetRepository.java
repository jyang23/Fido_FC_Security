package com.jy.fido_security.classes;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PetRepository extends CrudRepository<Pet,Long> {
    ArrayList<Pet> findByOwnerfirstname(String ownerfirstname);
    ArrayList<Pet> findByOwnerlastname(String ownerlastname);
    ArrayList<Pet> findByPetname(String petname);
    ArrayList<Pet> findByDatelost(String datelost);
    ArrayList<Pet> findByBreed(String breed);
    ArrayList<Pet> findByStatus(String status);

}