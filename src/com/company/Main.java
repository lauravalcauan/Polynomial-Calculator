package com.company;
import model.*;
import View.View;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Polinom p = new Polinom();
        PolynomialParser polynomialParser = new PolynomialParser();
        Polinom q = polynomialParser.convert("X^3+4X^2+5X^1+6");
        p = polynomialParser.convert("X^2+2X^1+1");

        Addition ad = new Addition();
        ArrayList<Monom> sum = new ArrayList<Monom>();
        sum = ad.addition(p, q);
        System.out.println(sum.toString());

        Substraction substraction = new Substraction();
        ArrayList<Monom> sub = new ArrayList<Monom>();
        sub = substraction.substraction(p, q);
        System.out.println(sub.toString());

        Multiplication multiplication = new Multiplication();
        ArrayList<Monom> mult = new ArrayList<Monom>();
        mult = multiplication.multiplication(p, q);
        System.out.println(mult.toString());


//        JFrame frame = new View("Polynomial Calculator");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View("title");
            }
        });
    }
    }




}
