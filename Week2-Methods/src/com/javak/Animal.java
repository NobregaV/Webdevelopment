package com.javak;

public class Animal {
//    protected static Object type;
    //    Variable
    public String naam;
    public int leeftijd;
    public static String type = "Animal";

    public Animal(String naam, int leeftijd) {
    this.naam = naam;
    this.leeftijd = leeftijd;
    }


    public String showType() {
        return type;
//        System.out.println(type);
//        System.out.println(Animal.type);


    }


    //    Method
    public void Feed() {
        System.out.println("Dit is Feed");

    }
//    Method
    public void VisitVet() {
        System.out.println("Dit is VisitVet");
    }



//    public String showName () {
//        return naam;
//    }

// Constructor

//   public Animal() {
//        this.naam = naam;
//        this.leeftijd = leeftijd;
//        this.type = type;
//
//    }

//    public void showType() {
//        boolean animal1 = false;
//        System.out.println(animal1);
//    }


}


