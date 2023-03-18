package _02_shapes_inheritance;

import java.awt.Color;

/*
 * In order to use inheritance we have to use the keyword "extends".
 * so the Hexagon class extends the Shape class. 
 * 
 * Notice how we do not have member variables written at the top of 
 * this class anymore. That is because we "inherit" them from 
 * the Shape class. Think back to the parent and child. They share 
 * the same eye and hair color, just like Shape and Hexagon share 
 * the same member variables(xLocation,yLocation,size,color,rob).
 * 
 * We also use a keyword "super" which allows us to use the Shape 
 * constructor in the Hexagon class. 
 * 
 * Notice how we are also missing the setupRobot() method in this 
 * class. That is because we can just use the one from the Shape 
 * class, so we do not need to have it in this class.
 * 
 * Make sure to look at the Square and Triangle class as well. 
 */
public class Hexagon extends Shape {

	Hexagon(int xLocation, int yLocation, int size, Color color) {
		super(xLocation, yLocation, size, color);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		for (int i = 0; i < 6; i++) {
			rob.move(size);
			rob.turn(60);
		}
	}
	
}
