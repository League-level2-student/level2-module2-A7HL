package _05_overriding;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Overriding is when a sub-class changes("overrides") a specific
 * method implementation from the Super/Parent class.
 * 
 * Basically, the Parent and sub-class will have the same name method,
 * BUT they won't have the same code in them.
 * 
 * 1. Run the Runner Class to see what happens
 * 
 * 2. The 2 pizzas are the same...we are going to fix that
 * 	  Go to the PepperoniPizza class
 */
public class Pizza {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	public void make() {
		frame.setVisible(true);
		frame.add(label);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void show() {
		frame.setTitle("Pizza");
		label.setIcon(loadImage("pizza.jpeg"));
	}
	
	public void receipt() {
		System.out.println("You purchased a pizza for $10");
	}
	
	public static ImageIcon loadImage(String fileName) {
		try {
			return new ImageIcon(ImageIO.read(new Pizza().getClass().getResourceAsStream(fileName)));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	} 

}