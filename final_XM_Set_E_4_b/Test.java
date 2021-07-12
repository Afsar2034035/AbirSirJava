package final_XM_Set_E_4_b;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame {
	
	JButton btnHello = new JButton("Hello");
	JButton btnReplace = new JButton("Replace");
	JButton btnA = new JButton("A");
	JButton btnB = new JButton("BBBBBBBBBB");
	JButton btnC = new JButton("C");
	
	JTextField txt1 = new JTextField();
	JTextField txt2 = new JTextField();
	
	JLabel label1 = new JLabel("[to, be, or, not, to, be, hamlet]");
	
	JCheckBox chb = new JCheckBox("Case sensitive?");
	
	Test()
	{
		initSetup();
	}
	
	public void initSetup()
	{
		setVisible(true);
		setSize(550,350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("                                                            Lay it out");
		setResizable(false);
		setLayout(null);
		
		btnHello.setBounds(0,0,90,275);   // Total Height : 312
		btnA.setBounds(0,275, 183, 37);   // Total Weight : 534
		btnB.setBounds(183,275, 183, 37);
		btnC.setBounds(366,275, 168, 37);   //444
		
		btnReplace.setBounds(262, 10, 100, 25);
		
		txt1.setBounds(140, 13, 120, 20);
		txt2.setBounds(364, 13, 120, 20);
		
		label1.setBounds(91, 130, 180, 30);   // 275
		
		chb.setBounds(92, 250, 150, 25);
		
		add(btnHello);
		add(btnReplace);
		add(btnA);
		add(btnB);
		add(btnC);
		add(txt1);
		add(txt2);
		add(label1);
		add(chb);
	}
	
	public static void main(String[] args) {
		
		new Test();
	}
}