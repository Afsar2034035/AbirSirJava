package windowChange;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Launcher extends JFrame{
	
	JButton btnStart = new JButton("Start Project");
	
	Launcher()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		setSize(400, 400);
		setVisible(true);
		setTitle("Launcher");
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		btnStart.setBounds(100, 150, 150, 50);
		btnStart.setFocusable(false);
		add(btnStart);
		
	}
	
	public void action()
	{
		btnStart.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				new NewWindow();
			}
		});
	}

}
