package swing;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JframeBasic1 extends JFrame {
	
	private ImageIcon  icon;
	
	JframeBasic1()
	{
		initSetup();
	}
	
	public void initSetup()
	{
		setVisible(true);
		setSize(300,300);
		setTitle("JFrame Demo");
		setResizable(false);
		setLocationRelativeTo(null);
		
		icon = new ImageIcon("images/game.png");
		//icon = new ImageIcon("afsar.png");
		//icon = new ImageIcon("m.jpg");
		setIconImage(icon.getImage());
	}
	
	public static void main(String[] args)
	{
		JframeBasic1 frame = new JframeBasic1();
	}

}
