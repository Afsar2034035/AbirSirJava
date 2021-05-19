package swing;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ImgText1 {
	
	public static void main(String[] args)
	{
		ImageIcon img = new ImageIcon("images/game.png");
		//JOptionPane.showMessageDialog(null,"Wrong", "Login",JOptionPane.ERROR_MESSAGE);
		//ImageIcon img = new ImageIcon("images/m.jpg");
		
		JOptionPane.showMessageDialog(null,"Hello","Login",0,img);
	}

}
