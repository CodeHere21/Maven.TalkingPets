package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PetOwner {
    private String name="";
    private ArrayList<Pet> list=new ArrayList<Pet>();


    public PetOwner(String name) {
        this.name = name;
    }

    public void add(Pet pet){
        list.add(pet);
    }

    public String ownedPets(){
        String temp="";
        for(Pet p:list){
            temp=temp.concat(p.getName()+" ");
        }
        return temp;
    }
}
