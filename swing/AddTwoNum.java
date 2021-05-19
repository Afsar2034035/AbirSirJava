package swing;
import javax.swing.JOptionPane;

public class AddTwoNum {
	
	public static void main(String[] args)
	{
		String num1 = JOptionPane.showInputDialog(null,"Enter First Number","Addition",JOptionPane.INFORMATION_MESSAGE);
		String num2 = JOptionPane.showInputDialog(null,"Enter Second Number","Addition",JOptionPane.INFORMATION_MESSAGE);
		
		int a,b,c;
		
		a = Integer.parseInt(num1);
		b = Integer.parseInt(num2);
		c = a + b;
		
		JOptionPane.showMessageDialog(null,"The result is : "+c,"Addition",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
