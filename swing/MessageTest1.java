package swing;

import javax.swing.JOptionPane;

public class MessageTest1 {
	
	public static void main(String[] args)
	{
		//JOptionPane.showMessageDialog(null,"Wrong Input");
		//JOptionPane.showMessageDialog(null, "Wrong Password", "Login", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Wrong Password", "Login", JOptionPane.ERROR_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Wrong Password", "Login", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Wrong Password", "Login", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Wrong Password", "Login", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Wrong Password", "Login", JOptionPane.QUESTION_MESSAGE);
	}

}
