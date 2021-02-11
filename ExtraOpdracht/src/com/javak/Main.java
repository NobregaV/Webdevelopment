package com.javak;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input= new Scanner(System.in);

        System.out.print ("Wat is uw naam?");

        String invulNaam = input.nextLine();
        System.out.print("Wat is de dag van uw geboortedatum? ");

//        String invuldatum =

        public int calculateAgeWithJava (
                Date birthDate,
                Date currentDate) {
            DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
            int d1 = Integer.parseInt(formatter.format(birthDate));
            int d2 = Integer.parseInt(formatter.format(currentDate));
            int age = (d2 - d1) / 10000;
            return age;
        }

    }


}



