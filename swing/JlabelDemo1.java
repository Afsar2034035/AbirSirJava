package swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class JlabelDemo1 extends JFrame{

	JlabelDemo1()
	{
		initSetup();
	}
	
	public void initSetup()
	{
		JLabel label = new JLabel();
		label.setText("Hello BGC");
		
		ImageIcon icon = new ImageIcon("images/game.png");
		
		Border border = BorderFactory.createLineBorder(Color.blue, 3);
		
		label.setIcon(icon);
		
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		
		label.setForeground(Color.green);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		
		label.setIconTextGap(0);
		
		label.setBackground(Color.black);
		label.setOpaque(true);
		
		//label.setBounds(100, 100, 300, 300);
		label.setBorder(border);
		
		//label.setHorizontalAlignment(JLabel.RIGHT);
		//label.setVerticalAlignment(JLabel.TOP);
		
		//setSize(500, 500);
		setVisible(true);
		setTitle("JLabel Demo");
		setResizable(false);
		setLocationRelativeTo(null);
		//setLayout(null);
		
		add(label);
		pack();
	}
	
	public static void main(String[] args)
	{
		JlabelDemo1 obj = new JlabelDemo1(); 
	}
}
