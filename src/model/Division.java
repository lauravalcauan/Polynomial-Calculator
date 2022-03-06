package model;

import jdk.dynalink.Operation;

import java.util.ArrayList;

public class Division {
    private Polinom d = new Polinom();
    private Polinom i = new Polinom();

    public ArrayList<Monom> division(Polinom d, Polinom i) {
        ArrayList<Monom> res = new ArrayList<Monom>();
        Polinom c = new Polinom();
        PolynomialParser polynomialParser = new PolynomialParser();

        for (Monom k : d.getMonoms()) {
            for (Monom j: i.getMonoms()) {
                while(k.getConstant() >= j.getConstant()) {
                    ArrayList<Monom> md = d.getMonomMax();
                    ArrayList<Monom> mi = i.getMonomMax();
                    ArrayList<Monom> mc = md.divide(mi);
                    c.addMonom(mc);
                    Polinom aux = Multiplication(i, mc);
                    d = Substraction(d, aux);
                    res.add(c);
                    res.add(d);
                }
            }


    }
}
