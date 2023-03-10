import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class test extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JTextField textField;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, addButton, subButton, mulButton, divButton, clrButton, eqlButton;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    test() {

        setTitle("Calculator");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        textField = new JTextField();
        textField.setEditable(false);

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        clrButton = new JButton("C");
        eqlButton = new JButton("=");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        clrButton.addActionListener(this);
        eqlButton.addActionListener(this);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(addButton);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(subButton);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(mulButton);
        panel.add(button0);
        panel.add(clrButton);
        panel.add(eqlButton);
        panel.add(divButton);

        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1)
            textField.setText(textField.getText().concat("1"));
        if (e.getSource() == button2)
            textField.setText(textField.getText().concat("2"));
        if (e.getSource() == button3)
            textField.setText(textField.getText().concat("3"));
        if (e.getSource() == button4)
            textField.setText(textField.getText().concat("4"));
        if (e.getSource() == button5)
            textField.setText(textField.getText().concat("5"));
        if (e.getSource() == button6)
            textField.setText(textField.getText().concat("6"));
        if (e.getSource() == button7)
            textField.setText(textField.getText().concat("7"));
        if (e.getSource() == button8)
            textField.setText(textField.getText().concat("8"));
        if (e.getSource() == button9)
            textField.setText(textField.getText());
    }}