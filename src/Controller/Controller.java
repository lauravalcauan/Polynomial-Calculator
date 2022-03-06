package Controller;

import View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import appLogic.Logic;

public class Controller implements ActionListener {

    private View view;

    Logic logic = new Logic();

    public Controller(View view) { this.view = view;}

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == view.getButton()){
            String s = view.getText().getText();
            view.getLabel().setText(logic.operation(s));
            view.getLabel1().setText(logic.operation(s));
            view.getLabel2().setText(logic.operation(s));
        }

    }
}
