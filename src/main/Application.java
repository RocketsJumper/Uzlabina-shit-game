package main;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame{
	
	public Application() {
		initUI();
	}
	
	public void initUI() {
		add(new Game());
		setSize(1280, 720);
		setResizable(false);
		setTitle("Uzlabina shit game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //opens in the middle
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Application app = new Application();
				app.setVisible(true);
			}
		});
	}
	
}
