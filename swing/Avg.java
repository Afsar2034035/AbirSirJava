package swing;
import javax.swing.JOptionPane;

public class Avg {
	public static void main(String[] args)
	{
		String num1 = JOptionPane.showInputDialog(null,"Enter First Number ", "AVG", JOptionPane.WARNING_MESSAGE);
		String num2 = JOptionPane.showInputDialog(null,"Enter Second Number ", "AVG", JOptionPane.WARNING_MESSAGE);
		String num3 = JOptionPane.showInputDialog(null,"Enter Third Number ", "AVG", JOptionPane.WARNING_MESSAGE);
	
		double a,b,c,d;
		
		a = Double.parseDouble(num1);
		b = Double.parseDouble(num2);
		c = Double.parseDouble(num3);
		
		d = (a+b+c)/3;
		JOptionPane.showMessageDialog(null, "The Avg of three num is : "+d);
		
	}

}
