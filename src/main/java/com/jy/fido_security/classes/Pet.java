package com.jy.fido_security.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ownerfirstname;
    private String ownerlastname;
    private String petname;
    private String datelost;
    private String breed;
    private String description;
    private String photo;
    private String contactnumber;
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwnerfirstname() {
        return ownerfirstname;
    }

    public void setOwnerfirstname(String ownerfirstname) {
        this.ownerfirstname = ownerfirstname;
    }

    public String getOwnerlastname() {
        return ownerlastname;
    }

    public void setOwnerlastname(String ownerlastname) {
        this.ownerlastname = ownerlastname;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }

    public String getDatelost() {
        return datelost;
    }

    public void setDatelost(String datelost) {
        this.datelost = datelost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
