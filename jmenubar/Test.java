package jmenubar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame{
	
	JMenuBar MenuBar = new JMenuBar();
	
	JMenu FileMenu = new JMenu("File");
	JMenu EditMenu = new JMenu("Edit");
	JMenu SourceMenu = new JMenu("Source");
	JMenu RefactorMenu = new JMenu("Refactor");
	JMenu NavigateMenu = new JMenu("Navigate");
	JMenu SearchMenu = new JMenu("Search");
	JMenu ProgjectMenu = new JMenu("Project");
	JMenu RunMenu = new JMenu("Run");
	JMenu WindowMenu = new JMenu("Window");
	JMenu HelpMenu = new JMenu("Help");
	
	JMenuItem LoadItem = new JMenuItem("Load");
	JMenuItem SaveItem = new JMenuItem("Save");
	JMenuItem ExitItem = new JMenuItem("Exit");
	JMenuItem CopyItem = new JMenuItem("Copy");
	JMenuItem CutItem = new JMenuItem("Cut");
	JMenuItem PasteItem = new JMenuItem("Paste");
	JMenuItem RunItem = new JMenuItem("Run");
	JMenuItem DebugItem = new JMenuItem("Debug");
	JMenuItem RunAsItem = new JMenuItem("Run As");
	
	ImageIcon load = new ImageIcon("images/load.png");
	ImageIcon save = new ImageIcon("images/save.png");
	ImageIcon exit = new ImageIcon("images/exit.png");
	
	
	
	Test()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		
		FileMenu.add(LoadItem);
		FileMenu.add(SaveItem);
		FileMenu.add(ExitItem);
		
		LoadItem.setIcon(load);
		SaveItem.setIcon(save);
		ExitItem.setIcon(exit);
		
		EditMenu.add(CopyItem);
		EditMenu.add(CutItem);
		EditMenu.add(PasteItem);
		
		RunMenu.add(RunItem);
		RunMenu.add(DebugItem);
		RunMenu.add(RunAsItem);
		
		MenuBar.add(FileMenu);
		MenuBar.add(EditMenu);
		MenuBar.add(SourceMenu);
		MenuBar.add(RefactorMenu);
		MenuBar.add(NavigateMenu);
		MenuBar.add(SearchMenu);
		MenuBar.add(ProgjectMenu);
		MenuBar.add(RunMenu);
		MenuBar.add(WindowMenu);
		MenuBar.add(HelpMenu);
		
		LoadItem.setMnemonic(KeyEvent.VK_L);
		SaveItem.setMnemonic(KeyEvent.VK_S);
		ExitItem.setMnemonic(KeyEvent.VK_E);
		
		
		
		setSize(550, 420);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JMenuBar");
		setLayout(null);
		
		setJMenuBar(MenuBar);
		
	}
	
	public void action()
	{
		LoadItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println("Loading........");
			}
		});
		
		SaveItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Saving..........");
			}
		});
		
		ExitItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		
		new Test();
	}

}
