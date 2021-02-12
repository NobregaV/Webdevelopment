package com.javak;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

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
        System.out.println("------------");
        System.out.println("Wat is uw geboortedatum? Vul in als volgt: dd/mm/jjjj ");
        String invulDatum = inputDat.nextLine();
        System.out.println(invulDatum);

        String[] slashWeg = invulDatum.split("/");
      





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



