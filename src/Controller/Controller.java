package Controller;

import View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import appLogic.Logic;
import model.Operation;
import model.Polinom;
import model.PolynomialParser;

public class Controller implements ActionListener {

    private View view;

    Logic logic = new Logic();

//    Addition add = new Addition();

    public Controller(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        Object source = e.getSource();
//        if(source == view.getButton()){
//            String s = view.getpTextField().getText();
//            view.getLabel().setText(logic.operation(s));
//            view.getLabel1().setText(logic.operation(s));
//            view.getLabel2().setText(logic.operation(s));
//        }

        Polinom polinom1 = new Polinom();
        Polinom polinom2 = new Polinom();
        String polinom1Input = "";
        String polinom2Input = "";
        polinom2Input = view.getqTextField().getText();
        polinom1Input = view.getpTextField().getText();
        PolynomialParser polyParser = new PolynomialParser();
        Operation op = new Operation();
        polinom1 = polyParser.convert(polinom1Input);
        polinom2 = polyParser.convert(polinom2Input);
        Polinom result;

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
                view.getQuotientTextField().setText(tuple.getValue().toString());
                view.getResultTextField().setText(tuple.getKey().toString());
            }
        }

    }



}

