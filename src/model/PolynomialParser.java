package model;

public class PolynomialParser {

    public Polinom convert(String polinom) {

        String[] monomStrings = polinom.split("\\+");
        Polinom p = new Polinom();
        int constant;
        int exponent;

        for (String monomString : monomStrings) {
            if(monomString.length() > 0) {
                String[] expConst = monomString.split("X\\^");
                if(expConst[0].equals("")) {
                    constant = 1;
                }
                else {
                    constant = Integer.parseInt(expConst[0]);
                }
                if(expConst.length == 1) {
                    exponent = 0;
                }
                else {
                    exponent = Integer.parseInt(expConst[1]);
                }
                p.addMonom(new Monom(constant, exponent));
            }

        }

        return p;
    }


}
