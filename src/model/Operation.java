package model;

import java.util.*;

public class Operation {

    public ArrayList<Monom> addition (Polinom polinom1, Polinom polinom2) {
                ArrayList<Monom> sum = new ArrayList<Monom>();
                boolean[] visitedP = new boolean[polinom1.getMonoms().size()];
                boolean[] visitedQ = new boolean[polinom2.getMonoms().size()];

                for (Monom i : polinom1.getMonoms()) {
                    for (Monom j : polinom2.getMonoms())
                        if (i.getExponent() == j.getExponent()) {
                            Monom monom1 = new Monom(i.getConstant() + j.getConstant(), i.getExponent());
                            sum.add(monom1);
                            visitedP[polinom1.getMonoms().indexOf(i)] = true;
                            visitedQ[polinom2.getMonoms().indexOf(j)] = true;
                        }
                }

                for (Monom i : polinom1.getMonoms()) {
                    for (Monom j : polinom2.getMonoms()) {
                        if (!visitedP[polinom1.getMonoms().indexOf(i)]) {
                            visitedP[polinom1.getMonoms().indexOf(i)] = true;
                            Monom monom1 = new Monom(i.getConstant(), i.getExponent());
                            sum.add(monom1);
                        }
                        if (!visitedQ[polinom2.getMonoms().indexOf(j)]) {
                            visitedQ[polinom2.getMonoms().indexOf(j)] = true;
                            Monom monom1 = new Monom(j.getConstant(), j.getExponent());
                            sum.add(monom1);
                        }
                    }
                }

                return sum;
            }

    public List<Monom> subtraction(Polinom p, Polinom q) {
        List<Monom> sub = new ArrayList<Monom>();
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
                if (!visitedP[p.getMonoms().indexOf(i)]) {
                    visitedP[p.getMonoms().indexOf(i)] = true;
                    Monom monom1 = new Monom(i.getConstant(), i.getExponent());
                    sub.add(monom1);
                }
                if (!visitedQ[q.getMonoms().indexOf(j)]) {
                    visitedQ[q.getMonoms().indexOf(j)] = true;
                    Monom monom1 = new Monom(j.getConstant(), j.getExponent());
                    sub.add(monom1);
                }
            }
        }
        sub.remove(0);
        return sub;
    }

    public List<Monom> multiplication(Polinom p, Polinom q) {
        List<Monom> multiply = new ArrayList<>();
        Map<Double, Monom> map = new HashMap<>();
        for (Monom i : p.getMonoms()) {
            for (Monom j : q.getMonoms()) {
                Monom monom1 = new Monom(i.getConstant() * j.getConstant(), i.getExponent() + j.getExponent());
                if(map.containsKey(monom1.getExponent())){
                    map.put(monom1.getExponent(),Monom.add(map.get(monom1.getExponent()),monom1));
                }
                else{
                    map.put(monom1.getExponent(),monom1);
                }
            }
        }

        return new ArrayList<Monom>(map.values());
    }


    public Map.Entry<Polinom,Polinom> division(Polinom p, Polinom q){
        List<Monom> quotient = new ArrayList<>();
        Monom d;
        Polinom dq;
        while(q.getMaxMonom().getExponent() <= p.getMaxMonom().getExponent()){
            System.out.println("p: "+p.getMaxMonom().toString()+ " q: " +q.getMaxMonom().toString());
            d = Monom.divide(p.getMaxMonom(),q.getMaxMonom());
//            System.out.println(d.toString());
            quotient.add(d);
            dq = new Polinom(this.multiplication(new Polinom(new ArrayList<>(List.of(d))), q));
//            System.out.println(dq.toString());
            p = new Polinom(this.subtraction(p,dq));
            System.out.println(p.getMonoms() + " " + new Polinom(quotient) + " " + q.toString());
        }
        System.out.println("p: "+p.getMaxMonom().toString()+ " q: " +q.getMaxMonom().toString());
        return new AbstractMap.SimpleEntry<>(p,new Polinom(quotient));

    }


}

