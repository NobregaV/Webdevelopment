package com.javak;

public class Animal {

    public void Feed() {
        System.out.println("Test");

    }
    public void VisitVet() {
        System.out.println("Tweede test");
    }

    String naam;
    int leeftijd;
    static String type = "Animal";

    void Animal(String naam, int leeftijd, String type) {
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


