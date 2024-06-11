/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experiments2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WordCountApp extends JFrame implements ActionListener {
    JTextField inputField;
        JButton countButton;
        JLabel resultLabel;
    public WordCountApp() {
        setTitle("Word Counter -by TANISHK VARSHNEY");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        inputField = new JTextField(20);
        inputField.setBounds(10,20,260,20);
        
        countButton = new JButton("Count");
        countButton.setBounds(100,40,80,20);
        
        resultLabel = new JLabel("Word count will appear here");
        resultLabel.setBounds(10,70,200,20);

//        countButton.addActionListener(e -> resultLabel.setText("Word count: " + inputField.getText().split("\\s+").length));
        countButton.addActionListener(this);

        add(new JLabel("Enter your text:"));
        add(inputField);
        add(countButton);
        add(resultLabel);

        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = inputField.getText();
        int wordCount = text.split("\\s+").length;
        resultLabel.setText("Word Count: " + wordCount);
    }

    public static void main(String[] args) {
//        SwingUtilities.invokeLater(WordCountApp::new);
            new WordCountApp();
    }
}