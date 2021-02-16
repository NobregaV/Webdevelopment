package com.javak;

public class Animal {
//    protected static Object type;
    //    Variabelen
    protected String naam;
    protected int leeftijd;
   public static String type = "Animal";


    //    Methods
    public void Feed() {
        System.out.println("Test");

    }
    public void VisitVet() {
        System.out.println("Tweede test");
    }

// Constructor

   public Animal(String naam, int leeftijd, String type) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.type = type;

    }

    public void Bear1() {
        String naam = "Browny";
        String type = "Brown Bear";
        System.out.println("Dit is " + naam +" van het type " + type);
    }

    public void Bear2() {
        String naam = "Beertje";
        String type = "Polar Bear";
        System.out.println("Dit is " + naam +" van het type " + type);

    }
}


