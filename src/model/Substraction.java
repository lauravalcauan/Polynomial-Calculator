package model;


import java.util.ArrayList;

public class Substraction {

    private Polinom p = new Polinom();
    private Polinom q = new Polinom();

    public ArrayList<Monom> substraction(Polinom p, Polinom q) {
        ArrayList<Monom> sub = new ArrayList<Monom>();
        PolynomialParser polynomialParser = new PolynomialParser();
        boolean[] visitedP = new boolean[p.getMonoms().size()];
        boolean[] visitedQ = new boolean[q.getMonoms().size()];

        for (Monom i: p.getMonoms()) {
            for (Monom j : q.getMonoms())
                if (i.getExponent() == j.getExponent()) {
                    Monom monom1 = new Monom(i.getConstant() - j.getConstant(), i.getExponent());
                    sub.add(monom1);
                    visitedP[p.getMonoms().indexOf(i)] = true;
                    visitedQ[q.getMonoms().indexOf(j)] = true;
                }
        }

        for (Monom i: p.getMonoms()) {
            for (Monom j : q.getMonoms()) {
                if (visitedP[p.getMonoms().indexOf(i)] == false) {
                    visitedP[p.getMonoms().indexOf(i)] = true;
                    Monom monom1 = new Monom(i.getConstant(), i.getExponent());
                    sub.add(monom1);
                }
                if (visitedQ[q.getMonoms().indexOf(j)] == false) {
                    visitedQ[q.getMonoms().indexOf(j)] = true;
                    Monom monom1 = new Monom(j.getConstant(), j.getExponent());
                    sub.add(monom1);
                }
            }
        }

        return sub;
    }

}

