package model;

import java.util.ArrayList;

public class Multiplication {

    private Polinom p = new Polinom();
    private Polinom q = new Polinom();

    public ArrayList<Monom> multiplication(Polinom p, Polinom q) {
        ArrayList<Monom> multiply = new ArrayList<Monom>();
        PolynomialParser polynomialParser = new PolynomialParser();

        for (Monom i : p.getMonoms()) {
            for (Monom j : q.getMonoms())
                if (i.getExponent() == j.getExponent() && i.getExponent() != j.getExponent()) {
                    Monom monom1 = new Monom(i.getConstant() * j.getConstant(), i.getExponent() * j.getExponent());
                    multiply.add(monom1);
                }
        }

        return multiply;
    }
}
