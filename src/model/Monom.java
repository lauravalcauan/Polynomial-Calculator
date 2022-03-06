package model;

import java.util.ArrayList;

public class Monom {

    private double constant;
    private double exponent;

    public Monom(double constant, double exponent) {
        this.constant = constant;
        this.exponent = exponent;
    }

    public double getConstant() {
        return constant;
    }

    public void setConstant(double constant) {
        this.constant = constant;
    }

    public double getExponent() {
        return exponent;
    }

    public void setExponent(double exponent) {
        this.exponent = exponent;
    }

    public double evaluate(double value) {return this.constant * ((double) Math.pow(value, this.exponent));}

    @Override
    public String toString() {return this.constant + "*X^" + this.exponent;}


    public divide(ArrayList<Monom> monoms) {

    }
}
