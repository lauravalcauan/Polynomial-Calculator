package Controller;

import View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import model.Operation;
import model.Polinom;
import model.PolynomialParser;

public class Controller implements ActionListener {

    private View view;

    public Controller(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Polinom polinom1 = new Polinom();
        Polinom polinom2 = new Polinom();
        Polinom result;
        String polinom1Input = "";
        String polinom2Input = "";
        polinom2Input = view.getqTextField().getText();
        polinom1Input = view.getpTextField().getText();
        PolynomialParser polyParser = new PolynomialParser();
        Operation op = new Operation();
        polinom1 = polyParser.convert(polinom1Input);
        polinom2 = polyParser.convert(polinom2Input);

        switch (e.getActionCommand()) {
            case "+" -> {
                result = new Polinom(op.addition(polinom1, polinom2));
                view.getResultTextField().setText(result.toString());
            }
            case "-" -> {
                result = new Polinom(op.subtraction(polinom1, polinom2));
                view.getResultTextField().setText(result.toString());
            }
            case "*" ->{
                result = new Polinom(op.multiplication(polinom1,polinom2));
                view.getResultTextField().setText(result.toString());
            }
            case ":" ->{
                Map.Entry<Polinom,Polinom> tuple = op.division(polinom1,polinom2);
                view.getResultTextField().setText(tuple.getValue().toString());
                view.getRemainderTextField().setText(tuple.getKey().toString());
            }
            case "Reset" ->{
                view.getpTextField().setText("");
                view.getqTextField().setText("");
                view.getRemainderTextField().setText("");
                view.getResultTextField().setText("");
            }
        }

    }



}

