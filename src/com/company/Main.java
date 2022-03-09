package com.company;
import model.*;
import View.View;
import Controller.Controller;
import View.View;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//	    Polinom polinom1 = new Polinom();
//        Polinom polinom2 = new Polinom();
//        JTextField pInputText = new JTextField(20);
//        JTextField qInputText = new JTextField(20);
//        String userInput1 =  pInputText.getText();
//        String userInput2 = qInputText.getText();
//        PolynomialParser polynomialParser = new PolynomialParser();
//        polinom2 = polynomialParser.convert(userInput1);
//        polinom1 = polynomialParser.convert(userInput2);
////
////        Polinom polinom1 = new Polinom();
////        Polinom polinom2 = new Polinom();
////        View view = new View("title");
////        String polinom1Input = new String();
////        String polinom2Input = new String();
////        polinom2Input = view.getqTextField().getText();
////        polinom1Input = view.getpTextField().getText();
////        PolynomialParser polyParser = new PolynomialParser();
////
////        if(polinom1 == polyParser.convert(polinom1Input) && polinom2 == polyParser.convert(polinom2Input)) {
////            System.out.println("Ok");
////        } else {
////            System.out.println("nu ok:(");
////        }
//
//        Operation op = new Operation();
//        ArrayList<Monom> sum = new ArrayList<Monom>();
//        sum = op.addition(polinom1, polinom2);
//        System.out.println(sum.toString());
//
//        Substraction substraction = new Substraction();
//        ArrayList<Monom> sub = new ArrayList<Monom>();
//        sub = substraction.substraction(polinom1, polinom2);
//        System.out.println(sub.toString());
//
////        Multiplication multiplication = new Multiplication();
////        ArrayList<Monom> mult = new ArrayList<Monom>();
////        mult = multiplication.multiplication(polinom1, polinom2);
////        System.out.println(mult.toString());


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View("title");
            }
        });
    }

}

