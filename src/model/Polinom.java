package model;

import java.util.ArrayList;
import java.util.List;

public class Polinom {

    private int[] coef;
    private int degree;

    private final List<Monom> monoms;

    public Polinom() {
        monoms = new ArrayList<>();
    }

    public void addMonom(Monom m) {
        monoms.add(m);
    }

    public List<Monom> getMonoms() {
        return monoms;
    }

    public double evaluate(double value) {
        double poliValue = 0.0;
        for (Monom m : monoms) {
            poliValue += m.evaluate(value);

        }

        return poliValue;
    }

    public ArrayList<Monom> getMonomMax() {
        Polinom p = new Polinom();
        ArrayList<Monom> maxMonom = new ArrayList<Monom>();

        for (Monom i : p.getMonoms()) {
            for(Monom j : p.getMonoms()) {
                if( i.getExponent() > j.getExponent()) {
                    Monom max = new Monom(i.getExponent(), i.getConstant());
                    maxMonom.add(max);
                } else {
                   Monom max = new Monom(j.getExponent(), j.getConstant());
                   maxMonom.add(max);
                }
            }

        }

        return maxMonom;

        }




}
