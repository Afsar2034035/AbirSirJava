package windowChange;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow extends JFrame{
	
	JLabel lblHello = new JLabel("Hello");
	JButton btnBack = new JButton("Back");
	
	NewWindow()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		setSize(400, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("New Window");
		setResizable(false);
		setLayout(null);
		
		lblHello.setBounds(100, 100, 200, 50);
		lblHello.setFont(new Font("Arial", Font.BOLD, 20));
		
		btnBack.setBounds(100, 250, 150, 50);
		btnBack.setFocusable(false);
		
		add(lblHello);
		add(btnBack);
		
	}
	
	public void action()
	{
		btnBack.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				new Launcher();
			}
		});
	}
	
	

}
