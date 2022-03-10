package View;

import Controller.Controller;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
    private JTextField remainderTextField = new JTextField(20);
    private JLabel pLabel = new JLabel("P");
    private JLabel qLabel = new JLabel("Q");
    private JLabel resultLabel = new JLabel("Result");
    private JLabel remainderLabel = new JLabel("Remainder");
    private JButton sumButton = new JButton("+");
    private JButton subButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divisionButton = new JButton(":");
    private JButton resetButton = new JButton("Reset");
    private static JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

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
        panel.add(remainderLabel, c);

        c.gridx = 1;
        c.gridy = 4;
        panel.add(remainderTextField, c);

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

        c.gridx = 6;
        c.gridy = 4;
        panel.add(resetButton, c);
        resetButton.addActionListener(controller);

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

    public JTextField getRemainderTextField() {
        return remainderTextField;
    }


}