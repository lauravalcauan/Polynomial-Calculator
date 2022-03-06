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
    private JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    private JButton button = new JButton("OK");
    private JButton pbutton = new JButton("P");
    private JButton qbutton = new JButton("Q");
    private JTextField text = new JTextField(20);
    private JLabel label = new JLabel("result");
    private JLabel label1 = new JLabel("P");
    private JLabel label2  = new JLabel("Q");

    Controller controller = new Controller(this);

    public View(String name) {
        super(name);
//        c.gridx = 1;
//        c.gridy = 0;
//        panel.add(button, c);
//        button.addActionListener(controller);

//        c.gridx = 0;
//        c.gridy = 0;
//        panel.add(text, c);

//        c.gridx = 0;
//        c.gridy = 0;
        //panel.add(pbutton, c);
        label1.setBounds(100, 60, 80, 25);
        panel.add(label1);
        pbutton.addActionListener(controller);


        c.gridx = 0;
        c.gridy = 0;
        panel.add(text, c);

        this.add(panel);
    }

    public JButton getButton() {return button;}
    public JButton getPbutton() {return pbutton;}
    public JButton getQbutton() {return qbutton;}
    public JTextField getText() {return  text;}

    public JLabel getLabel() { return label;}
    public JLabel getLabel1() {return label1;}
    public JLabel getLabel2() {return label2;}

}
