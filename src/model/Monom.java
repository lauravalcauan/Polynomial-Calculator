package model;

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

    public static Monom add(Monom m1, Monom m2){

        if(m1.getExponent() != m2.getExponent()){
            throw new RuntimeException("Monoms do not have same exponent!");
        }

        return new Monom(m1.getConstant()+m2.getConstant(),m1.getExponent());
    }

    public static Monom divide(Monom m1, Monom m2){
        return new Monom(m1.getConstant()/ m2.getConstant(), m1.getExponent() - m2.getExponent());
    }

    @Override
    public String toString() {

        if(this.constant == 0){
            return "";
        }

        String constantS = "";
        String exponentS = "";

        if(!(this.exponent == 0)){
            exponentS = "X^" + ((int) this.exponent);
        }

        if(this.constant > 0){
            constantS = "+";
        }

        if(this.constant != 1 || this.exponent == 0) {
            if (Math.floor(this.constant) == this.constant) {
                constantS += ((int) (this.constant));
            } else {
                constantS += this.constant;
            }
        }
        return constantS + exponentS;

    }

}
