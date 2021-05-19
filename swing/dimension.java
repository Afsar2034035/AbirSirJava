package swing;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class dimension {

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		
		int width = size.width;
		int height = size.height;
		
		frame.setSize(width,height);
		
		frame.setTitle("Full Screen Demo");
		frame.setResizable(false);
	}
}
