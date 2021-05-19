package jtextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test1 extends JFrame {

	JTextField txt = new JTextField();
	JButton btnSubmit = new JButton("Submit");
	
	Test1()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		txt.setText("Afsar ");
		setSize(500, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JText Field");
		setLayout(new FlowLayout());
		
		txt.setPreferredSize(new Dimension(250, 50));
		txt.setFont(new Font("Arial", Font.BOLD, 20));
		
		txt.setBackground(Color.black);
		txt.setForeground(Color.white);
		txt.setCaretColor(Color.red);
		
		btnSubmit.setPreferredSize(new Dimension(100, 50));
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 20));
		
		
		add(txt);
		add(btnSubmit);
	}
	
	public void action()
	{
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				String name = txt.getText();
				System.out.println(name);
				txt.setEditable(false);
				btnSubmit.setEnabled(false);
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		
		new Test1();

	}

}
