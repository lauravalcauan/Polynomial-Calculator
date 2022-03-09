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

    public void setpTextField(JTextField pTextField) {
        this.pTextField = pTextField;
    }

    public void setqTextField(JTextField qTextField) {
        this.qTextField = qTextField;
    }

    public void setResultTextField(JTextField resultTextField) {
        this.resultTextField = resultTextField;
    }

    public void setQuotientTextField(JTextField quotientTextField) {
        this.quotientTextField = quotientTextField;
    }

    public void setpLabel(JLabel pLabel) {
        this.pLabel = pLabel;
    }

    public void setqLabel(JLabel qLabel) {
        this.qLabel = qLabel;
    }

    public void setResultLabel(JLabel resultLabel) {
        this.resultLabel = resultLabel;
    }

    public void setQuotientLabel(JLabel quotientLabel) {
        this.quotientLabel = quotientLabel;
    }

    public void setSumButton(JButton sumButton) {
        this.sumButton = sumButton;
    }

    public void setSubButton(JButton subButton) {
        this.subButton = subButton;
    }

    public void setMultiplyButton(JButton multiplyButton) {
        this.multiplyButton = multiplyButton;
    }

    public void setDivisionButton(JButton divisionButton) {
        this.divisionButton = divisionButton;
    }

    public void setDerivativeButton(JButton derivativeButton) {
        this.derivativeButton = derivativeButton;
    }

    public void setIntegrationButton(JButton integrationButton) {
        this.integrationButton = integrationButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }

    public static void setPanel(JPanel panel) {
        View.panel = panel;
    }

    Controller controller = new Controller(this);

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
        sumButton.addActionListener(controller);

        c.gridx = 6;
        c.gridy = 0;
        panel.add(subButton, c);
        subButton.addActionListener(controller);

        c.gridx = 6;
        c.gridy = 1;
        panel.add(multiplyButton, c);
        multiplyButton.addActionListener(controller);

        c.gridx = 5;
        c.gridy = 1;
        panel.add(divisionButton, c);
        divisionButton.addActionListener(controller);

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

        JFrame frame = new JFrame("Polynomial Calculator");
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