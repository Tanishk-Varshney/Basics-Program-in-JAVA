/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experiments2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class WordCounter extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JButton countButton;
    private JLabel wordCountLabel;
    private JScrollPane jspt;
    private JPanel down;

    public WordCounter() {
        setTitle("Word Counter -by TANISHK VARSHNEY");
        setSize(600,700);
        setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setFont(new Font("Arial",Font.PLAIN,25));
        
        jspt=new JScrollPane(textArea);
        jspt.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jspt.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        countButton = new JButton("Count Words");
        countButton.addActionListener(this);

        wordCountLabel = new JLabel("Word Count: 0");
        wordCountLabel.setForeground(Color.red);
        wordCountLabel.setFont(new Font("Arial",Font.BOLD,20));
        
        down = new JPanel();
        down.setLayout(new BorderLayout());
        down.add(countButton, BorderLayout.EAST);
        down.add(wordCountLabel, BorderLayout.WEST);
        
        add(jspt,BorderLayout.CENTER);
        add(down,BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        int wordCount = text.split("\\s+").length;
        wordCountLabel.setText("Word Count: " + wordCount);
    }
  
    public static void main(String[] args) {
        new WordCounter();
    }
}
