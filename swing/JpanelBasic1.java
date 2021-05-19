package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class JpanelBasic1 extends JFrame  {
private ImageIcon  icon;
	
	JpanelBasic1()
	{
		initSetup();
	}
	
	public void initSetup()
	{
		setVisible(true);
		setSize(900,800);
		setTitle("JFrame Demo");
		//setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(10,10));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.cyan);
		panel4.setBackground(Color.black);
		panel5.setBackground(Color.blue);
		
		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.SOUTH);
		add(panel3,BorderLayout.EAST);
		add(panel4,BorderLayout.WEST);
		add(panel5,BorderLayout.CENTER);
		
		panel5.setLayout(new BorderLayout(10,10));
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setPreferredSize(new Dimension(100,100));
		panel7.setPreferredSize(new Dimension(100,100));
		panel8.setPreferredSize(new Dimension(100,100));
		panel9.setPreferredSize(new Dimension(100,100));
		panel10.setPreferredSize(new Dimension(100,100));
		
		panel6.setBackground(Color.gray);
		panel7.setBackground(Color.orange);
		panel8.setBackground(Color.white);
		panel9.setBackground(Color.pink);
		panel10.setBackground(Color.MAGENTA);
		
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.EAST);
		panel5.add(panel9,BorderLayout.WEST);
		panel5.add(panel10,BorderLayout.CENTER);
		
		//panel10.setLayout(new BorderLayout(10,10));
		panel10.setLayout(new BorderLayout(10,10));
		
		JPanel panel11 = new JPanel();
		JPanel panel12 = new JPanel();
		JPanel panel13 = new JPanel();
		JPanel panel14 = new JPanel();
		JPanel panel15 = new JPanel();
		
		panel11.setPreferredSize(new Dimension(100,100));
		panel12.setPreferredSize(new Dimension(100,100));
		panel13.setPreferredSize(new Dimension(100,100));
		panel14.setPreferredSize(new Dimension(100,100));
		panel15.setPreferredSize(new Dimension(100,100));
		
		panel11.setBackground(Color.green);
		panel12.setBackground(Color.cyan);
		panel13.setBackground(Color.magenta);
		panel14.setBackground(Color.orange);
		panel15.setBackground(Color.black);
		
	    panel10.add(panel11,BorderLayout.NORTH);
	    panel10.add(panel12,BorderLayout.SOUTH);
	    panel10.add(panel13,BorderLayout.EAST);
		panel10.add(panel14,BorderLayout.WEST);
		panel10.add(panel15,BorderLayout.CENTER);
		  
		  
//		icon = new ImageIcon("images/game.png");
//		icon = new ImageIcon("afsar.png");
//		icon = new ImageIcon("m.jpg");
//		setIconImage(icon.getImage());
	}
	
	public static void main(String[] args)
	{
		JpanelBasic1 frame = new JpanelBasic1();
	}
}
