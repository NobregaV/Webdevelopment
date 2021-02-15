package com.javak;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input= new Scanner(System.in);
        Scanner inputDat = new Scanner(System.in);

//        int calculateAge;
//        Comparator<Date> calculateAge = (Date birthDate, Date currentDate) ->
//        {
//            DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
//            int d1 = Integer.parseInt(formatter.format(birthDate));
//            int d2 = Integer.parseInt(formatter.format(currentDate));
//            int age = (d2 - d1) / 10000;
//            return age;
//        };



        System.out.println ("Wat is uw naam?");

        String invulNaam = input.nextLine();

        System.out.println("Wat is uw geboortedatum?");
        System.out.println("Vul deze in als volgt: dd/mm/jjjj");
        String invulDatum = inputDat.nextLine();
//        System.out.println(invulDatum);

        String[] slashWeg = invulDatum.split("/");

        int dag = parseInt(slashWeg[0]);
        int mnd = parseInt(slashWeg[1]);
        int jaar = parseInt(slashWeg[2]);
//        System.out.println(dag);
//        System.out.println(mnd);
//        System.out.println(jaar);

        LocalDate vandaag = LocalDate.now();
        LocalDate gebdat = LocalDate.of(jaar, mnd, dag);
//        System.out.println(gebdat);
//        System.out.println(vandaag);

        Period leeftijd = Period.between(gebdat, vandaag);
        System.out.println("Hallo " + invulNaam + " uw leeftijd is " + leeftijd.getYears() + " jaar.");
        System.out.println("Fijne dag verder!");









//public Comparator<Date>

    }

//    Comparator<Date> calculateAge = (Date birthDate, Date currentDate) ->
//    {
//        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
//        int d1 = Integer.parseInt(formatter.format(birthDate));
//        int d2 = Integer.parseInt(formatter.format(currentDate));
//        int age = (d2 - d1) / 10000;
//        return age;
//    };


}



