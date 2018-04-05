package com.marcus8448.quickMath;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import java.awt.Dimension;

class QuickMath extends JFrame implements ItemListener, ActionListener {
    private static final long serialVersionUID = 1L;
    JFrame frame = new JFrame();
    NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.CANADA);
    NumberFormat currencyUK = NumberFormat.getCurrencyInstance(Locale.US);
    private final TextField number1 = new TextField("                ");
    private final Label operator = new Label("   ");
    private final TextField number2 = new TextField("                ");
    private final Label spacer = new Label("          ");
    private final Button submit = new Button("Submit");
    private final JComboBox<String> box = new JComboBox<String>(); 
    private final Label answer = new Label("                                                ", Label.CENTER);
    
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuickMath window = new QuickMath();
					window.frame.setVisible(false);
					window.setSize(new Dimension(400, 150));
					window.setPreferredSize(new Dimension(400, 150));
					window.setTitle("QuickMath Version 1.0");
					window.frame.setTitle("QuickMath Version 1.0");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
    public QuickMath() {
        getContentPane().setLayout(new FlowLayout());
        
        getContentPane().setPreferredSize(new Dimension(400, 150));
        
        getContentPane().setSize(new Dimension(400, 150));
        
        frame.setSize(new Dimension(400, 150));
        
        getContentPane().add(number1);
        
        getContentPane().add(operator);
        
        getContentPane().add(number2);
        
        getContentPane().add(box);
        box.addItem("???");
        box.addItem("Multiply");
        box.addItem("Divide");
        box.addItem("Add");
        box.addItem("Subtract");
        box.addItem("Add");
        box.addItemListener(this);
        number1.addActionListener(box);
        
          getContentPane().add(spacer);
        submit.setEnabled(false);
        submit.addActionListener(this);        
        getContentPane().add(submit);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(answer);
        
        setSize(150, 100);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent i) {
    	if (box.getSelectedItem().equals("Multiply")) {
    		operator.setText(" * ");
    	}
    	if (box.getSelectedItem().equals("Divide")) {
    		operator.setText(" / ");
    	}
    	if (box.getSelectedItem().equals("Add")) {
    		operator.setText(" + ");
    	} 
    	if (box.getSelectedItem().equals("Subtract")) {
    		operator.setText(" - ");
    	}
    	if (box.getSelectedItem().equals("???")) {
    		submit.setEnabled(false);
    		operator.setText("   ");
    	}
    	if (number1 != null & number2 != null) {
    		submit.setEnabled(true);
    	} else {
    		submit.setEnabled(false);
    	}
    }
	@Override
	public void actionPerformed(ActionEvent AEvent) {
		if (operator.getText() == " * ") {
		try {
			String String1 = number1.getText();
			String String2 = number2.getText();
			double double1 = Double.parseDouble(String1);
			double double2 = Double.parseDouble(String2);
			double answerD = double1 * double2;
			String answer = Double.toString(answerD);
			this.answer.setText(answer);
		} catch (Exception ex) {
			answer.setText("ERROR Please try again");
		}
		}
		if (operator.getText() == " / ") {
		try {
			String String1 = number1.getText();
			String String2 = number2.getText();
			double double1 = Double.parseDouble(String1);
			double double2 = Double.parseDouble(String2);
			double answerD = double1 / double2;
			String answer = Double.toString(answerD);
			this.answer.setText(answer);
		} catch (Exception ex) {
			answer.setText("ERROR Please try again");
		}
		}
		if (operator.getText() == " + ") {
		try {
			String String1 = number1.getText();
			String String2 = number2.getText();
			double double1 = Double.parseDouble(String1);
			double double2 = Double.parseDouble(String2);
			double answerD = double1 + double2;
			String answer = Double.toString(answerD);
			this.answer.setText(answer);
		} catch (Exception ex) {
			answer.setText("ERROR Please try again");
		}
		}
		if (operator.getText() == " - ") {
		try {
			String String1 = number1.getText();
			String String2 = number2.getText();
			double double1 = Double.parseDouble(String1);
			double double2 = Double.parseDouble(String2);
			double answerD = double1 - double2;
			String answer = Double.toString(answerD);
			this.answer.setText(answer);
		} catch (Exception ex) {
			answer.setText("ERROR Please try again");
		}
		}
		
	}
}