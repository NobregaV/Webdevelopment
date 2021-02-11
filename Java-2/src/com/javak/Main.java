package com.javak;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] eastcars = {"Kia", "Honda"};
        String[] cars = {"Kia", "Volkswagen", "Renault", "Honda", "BMW"};
        ArrayList<String> westcars = new ArrayList<>();


        for (String strTemp : cars) {
//            System.out.println(strTemp);


            if (strTemp == eastcars[0] && strTemp == eastcars[1])
            {
//                System.out.println("oke");
            }
            else {
                westcars.add(strTemp);
            }

            Arrays.sort(cars);

           for (int i=0; i< cars.length; i++)
           {
               System.out.println(cars[i]);
           }

        }


    }

    }

