package org.example;import javax.swing.*;
import java.awt.*;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        JTextArea firsttext = new JTextArea("");
        JTextArea doubletext = new JTextArea("");
        JLabel label = new JLabel("");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300,300));
        frame.setVisible(true);frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        frame.setLayout(null);

        frame.getContentPane().add(firsttext);
        frame.getContentPane().add(doubletext);
        frame.getContentPane().add(label);




        firsttext.setBounds(20,20,200,20);
        doubletext.setBounds(20,50,200,20);



JButton button_plus = new JButton("+");
JButton button_minus = new JButton("-");
JButton button_multiplication = new JButton("*");
JButton button_divide = new JButton("/");

        frame.getContentPane().add(button_plus);
        button_plus.setBounds(20,80,150,20);
        frame.getContentPane().add(button_minus);
        button_minus.setBounds(20,100,150,20);
        frame.getContentPane().add(button_multiplication);
        button_multiplication.setBounds(20,120,150,20);
        frame.getContentPane().add(button_divide);
        button_divide.setBounds(20,140,150,20);

        button_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firsttext.getText());
                double num2 = Double.parseDouble(doubletext.getText());
                JOptionPane.showMessageDialog(frame,   num1 + num2);
            }
        });
        button_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firsttext.getText());
                double num2 = Double.parseDouble(doubletext.getText());
                JOptionPane.showMessageDialog(frame, num1 - num2);
            }
        });
        button_multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firsttext.getText());
                double num2 = Double.parseDouble(doubletext.getText());
                JOptionPane.showMessageDialog(frame, num1 * num2);
            }
        });
        button_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(firsttext.getText());
                double num2 = Double.parseDouble(doubletext.getText());
                JOptionPane.showMessageDialog(frame, num1 / num2);
            }
        });
    }
}