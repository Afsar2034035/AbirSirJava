package jbutton;
import javax.swing.*;
import java.awt.*;

public class ButtonDemo5_GridLayout extends JFrame{
	
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	
	ButtonDemo5_GridLayout()
	{
		initSetup();
	}
	
	public void initSetup()
	{
		setSize(300,300);
		setVisible(true);
		setLocationRelativeTo(null);
		
		setTitle("JButton");
		setLayout(new GridLayout(3,3,10,10));
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
	}
	
	public static void main(String[] args)
	{
		new ButtonDemo5_GridLayout();
	}

}
