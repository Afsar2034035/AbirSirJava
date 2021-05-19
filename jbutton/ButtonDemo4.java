package jbutton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonDemo4 extends JFrame{
	
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	
	JPanel panel = new JPanel();
	
	ButtonDemo4()
	{
		initSetup();
	}
	
	public void initSetup()
	{
		setSize(500,500);
		setVisible(true);
		setLocationRelativeTo(null);
		
		setTitle("JButton");
		
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		//setLayout(new FlowLayout(FlowLayout.LEADING));
		//setLayout(new FlowLayout(FlowLayout.TRAILING));
		
//		setLayout(new GridLayout());
//		add(btn1);
//		add(btn2);
//		add(btn3);
//		add(btn4);
//		add(btn5);
//		add(btn6);
//		add(btn7);
//		add(btn8);
//		add(btn9);
		
		
		
		 panel.setPreferredSize(new Dimension(300,300));
		 panel.setBackground(Color.CYAN); 
		 panel.setLayout(new FlowLayout());
		 panel.add(btn1);  
		 panel.add(btn2); 
		 panel.add(btn3); 
		 panel.add(btn4);
		 panel.add(btn5); 
		 panel.add(btn6); 
		 panel.add(btn7); 
		 panel.add(btn8); 
		 panel.add(btn9); 
		 
		 add(panel);
	}
	
	public static void main(String[] args)
	{
		new ButtonDemo4();
	}

}
