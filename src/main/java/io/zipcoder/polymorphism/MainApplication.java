package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("How many pets do you have");
//        int numOfPets= scanner.nextInt();
////        System.out.println("What kind of pet is it?");
////        Scanner scanner1=new Scanner(System.in);
////        String typeOfPet=scanner1.nextLine();
////        System.out.println("What is your pets name?");
////        Scanner scanner2=new Scanner(System.in);
////        String nameofPet=scanner2.nextLine();
//        String name;
//        String names[]= new String[numOfPets];
//        Scanner input4=new Scanner(System.in);
//        int count=1;
//        for(int i=0;i<numOfPets;i++){
//            System.out.println("Type name of your pet"+count);
//            name=input4.nextLine();
//            names[i]=name;
//            count++;
//
//        }
        Cat cat1=new Cat();
        PetOwner lena=new PetOwner("Lena");
        lena.add(cat1);
        cat1.setName("Chewy");
        System.out.println(lena.ownedPets());

    }
}
