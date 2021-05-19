package midxm;
import javax.swing.JOptionPane;

public class QuesNo1 {

	public static void main(String[] args) {
		
		int x;
		x = JOptionPane.showConfirmDialog(null, "Are you want to check Prime num or Not?", "Check Prime Number", JOptionPane.YES_NO_OPTION);
		
		if(x==0)
		{
			String num;
			num = JOptionPane.showInputDialog(null, "Enter a Number: ","Input Number",JOptionPane.INFORMATION_MESSAGE); 
			
			int a,c=0;
			a = Integer.parseInt(num);
			
			for(int i=2; i<=a/2; i++)
			{
				if(a%i==0)
				{
					c=1;
					break;
				}
			}
			if(c==0)
			{
				JOptionPane.showMessageDialog(null, a+" is a Prime Number.");
			}
			else
			{
				JOptionPane.showMessageDialog(null, a+" is not a Prime Number.");
			}
		}
		
		if(x==1)
		{
			JOptionPane.showMessageDialog(null, "NO");
		}
	}

}
