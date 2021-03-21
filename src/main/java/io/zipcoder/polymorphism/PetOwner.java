package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PetOwner {
    private String name="";
    private Pet[] pets = new Pet[0];

    public PetOwner(String name, Pet[] pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }
}
