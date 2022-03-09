package model;

import java.util.ArrayList;
import java.util.List;

public class Polinom {

    private final List<Monom> monoms;

    public Polinom() {
        monoms = new ArrayList<>();
    }

    public Polinom(List<Monom> monoms1) { this.monoms = monoms1;}

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

    public Monom getMaxMonom() {
        Monom max = monoms.get(0);

        for(Monom m : monoms){
            if(m.getExponent() >= max.getExponent()){
                max = m;
            }
        }

        return max;
    }

    @Override
    public String toString(){
        StringBuilder poliString = new StringBuilder();

        for(Monom m : this.monoms){
            poliString.append(m.toString());
        }

        if(poliString.toString().length() == 0){
            return "0";
        }

        return poliString.toString();
    }


}
