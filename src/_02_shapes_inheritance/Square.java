package _02_shapes_inheritance;

import java.awt.Color;

public class Square extends Shape {

	Square(int xLocation, int yLocation, int size, Color color) {
		super(xLocation, yLocation, size, color);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		for (int i = 0; i < 4; i++) {
			rob.move(size);
			rob.turn(90);
		}
	}
	
}
