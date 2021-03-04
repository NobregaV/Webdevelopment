package com.javak;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
//Jframe aanmaken
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton studentBtn = new JButton();
        JButton teacherBtn = new JButton();



//        waardes bepalen
        frame.setTitle("Registration form");
        studentBtn.setText("Student");
        teacherBtn.setText("Teacher");
        frame.setVisible(true);




//Adding btn to frame

        panel.add(studentBtn);
        panel.add(teacherBtn);
        frame.add(panel);




//Pattern wachtWoord = Pattern.compile("/^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$/");
//        Matcher ww = wachtWoord.matcher();
//         Boolean w = ww.matches();
//
//
    }
}
