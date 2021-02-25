package com.javak;

public class Main {

    public static void main(String[] args) {
        // write your code here

int addition = add(30,10);
int substraction = substract(30,10);

        System.out.println("addition =" +addition);
        System.out.println("substraction =" +substraction);

    }
    static int add(int a, int b)
    {
//        lange manier
//       int add = a+b;
//       return add;
//       shortcut voor bovenstaande
        return (a+b);
    }
    static int substract(int a, int b)
    {
//        lange manier
//      int sub = a-b;
//      return sub;
//      Shortcut:
        return (a-b);
    }

}
