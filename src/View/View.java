package View;

import Controller.Controller;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField pTextField = new JTextField(20);
    private JTextField qTextField = new JTextField(20);
    private JTextField resultTextField = new JTextField(20);
    private JTextField quotientTextField = new JTextField(20);
    private JLabel pLabel = new JLabel("P");
    private JLabel qLabel = new JLabel("Q");
    private JLabel resultLabel = new JLabel("Result");
    private JLabel quotientLabel = new JLabel("Quotient");
    private JButton sumButton = new JButton("+");
    private JButton subButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divisionButton = new JButton(":");
    private JButton derivativeButton = new JButton("'");
    private JButton integrationButton = new JButton("S");
    private JButton resetButton = new JButton("Reset");
    private static JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

    //Controller controller = new Controller();

    public View(String title) {
        super(title);

        panel.setLayout(new GridBagLayout());

        c.gridx = 0; //column
        c.gridy = 0; //row
        panel.add(pLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        panel.add(pTextField, c);

        c.gridx = 0;
        c.gridy = 1;
        panel.add(qLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        panel.add(qTextField, c);

        c.gridx = 0;
        c.gridy = 3;
        panel.add(resultLabel, c);

        c.gridx = 1;
        c.gridy = 3;
        panel.add(resultTextField, c);

        c.gridx = 0;
        c.gridy = 4;
        panel.add(quotientLabel, c);

        c.gridx = 1;
        c.gridy = 4;
        panel.add(quotientTextField, c);

        c.gridx = 5;
        c.gridy = 0;
        panel.add(sumButton, c);

        c.gridx = 6;
        c.gridy = 0;
        panel.add(subButton, c);

        c.gridx = 6;
        c.gridy = 1;
        panel.add(multiplyButton, c);

        c.gridx = 5;
        c.gridy = 1;
        panel.add(divisionButton, c);

        c.gridx = 5;
        c.gridy = 3;
        panel.add(derivativeButton, c);

        c.gridx = 6;
        c.gridy = 3;
        panel.add(integrationButton, c);

        c.gridx = 6;
        c.gridy = 4;
        panel.add(resetButton, c);

        this.add(panel);

        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public JTextField getpTextField() {
        return pTextField;
    }

    public JTextField getqTextField() {
        return qTextField;
    }

    public JTextField getResultTextField() {
        return resultTextField;
    }

    public JTextField getQuotientTextField() {
        return quotientTextField;
    }

    public JLabel getpLabel() {
        return pLabel;
    }

    public JLabel getqLabel() {
        return qLabel;
    }

    public JLabel getResultLabel() {
        return resultLabel;
    }

    public JLabel getQuotientLabel() {
        return quotientLabel;
    }

    public JButton getSumButton() {
        return sumButton;
    }

    public JButton getSubButton() {
        return subButton;
    }

    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    public JButton getDivisionButton() {
        return divisionButton;
    }

    public JButton getDerivativeButton() {
        return derivativeButton;
    }

    public JButton getIntegrationButton() {
        return integrationButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public static JPanel getPanel() {
        return panel;
    }
}