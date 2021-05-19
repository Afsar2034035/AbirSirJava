package jbutton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


public class ButtonDemo1 extends JFrame {
	
	JButton btn1 = new JButton("Click Me");
	
	ImageIcon img1 = new ImageIcon("images/m.jpg");
	
	Border border = BorderFactory.createLineBorder(Color.red,3);
	
	ButtonDemo1()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		btn1.setBounds(170, 160, 150, 50);
		
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JButton Demo");
		setLayout(null);
		
		btn1.setIcon(img1);
		
		//btn1.setFont(new Font("MV Boli", Font.PLAIN, 20));
		//btn1.setForeground(Color.white);
		//btn1.setBackground(Color.black);
		//btn1.setBorder(border);
		
		add(btn1);
	}
	
	public void action()
	{
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//System.out.println("Hello");
				JOptionPane.showMessageDialog(null,"First Button!!", "JButton Demo",JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
	
	public static void main(String[] args)
	{
		new ButtonDemo1();
	}

}
