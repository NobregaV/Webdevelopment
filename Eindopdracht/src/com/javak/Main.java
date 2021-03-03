package com.javak;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here

Pattern wachtWoord = Pattern.compile("/^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$/");
        Matcher ww = wachtWoord.matcher();
         Boolean w = ww.matches();

         
    }
}
