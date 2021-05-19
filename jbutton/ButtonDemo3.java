package jbutton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


public class ButtonDemo3 extends JFrame{
	
	JButton btn1 = new JButton("ADD");
	JButton btn2 = new JButton("REMOVE");
	
	ImageIcon img1 = new ImageIcon("images/m.jpg");
	ImageIcon img2 = new ImageIcon("images/emoji3.jpg");
	
	Border border = BorderFactory.createLineBorder(Color.red,3);
	
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	Container c;
	
	ButtonDemo3()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		btn1.setBounds(60, 20, 150, 50);
		btn2.setBounds(270, 20, 150, 50);
		label.setBounds(100, 115, 300, 300);
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JButton Demo");
		setLayout(null);
		
		btn1.setIcon(img1);
		btn2.setIcon(img1);
		
//		btn1.setFont(new Font("MV Boli", Font.PLAIN, 20));
//		btn2.setFont(new Font("MV Boli", Font.PLAIN, 20));
//		btn1.setForeground(Color.white);
//		btn2.setForeground(Color.WHITE);
//		btn1.setBackground(Color.black);
//		btn2.setBackground(Color.BLACK);
//		btn1.setBorder(border);
//		btn2.setBorder(border);
		
		label.setIcon(img2);
		
		c = this.getContentPane();
		c.setBackground(Color.black);
		
		btn1.setToolTipText("Click ADD");
		btn2.setToolTipText("Click REMOVE");
		
		add(btn1);
		add(btn2);
		add(label);
		
		label.setVisible(false);
	}
	
	public void action()
	{
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				label.setVisible(true);
			}
		});
		
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				label.setVisible(false);
			}
		});
	}
	
	public static void main(String[] args)
	{
		new ButtonDemo3();
	}
}
