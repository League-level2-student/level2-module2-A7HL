package _01_shapes_original;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Square {
	int xLocation;
	int yLocation;
	int size;
	Color color;
	Robot rob;
	
	Square(int xLocation, int yLocation, int size, Color color) {
		this.xLocation=xLocation;
		this.yLocation=yLocation;
		this.size=size;
		this.color=color;
		this.rob=new Robot();
	}
	
	public void setupRobot() {
		rob.setSpeed(100);
		rob.moveTo(xLocation, yLocation);
		rob.setPenColor(color);
		rob.penDown();
	}
	
	public void draw() {
		for (int i = 0; i < 4; i++) {
			rob.move(size);
			rob.turn(90);
		}
	}
	
}
