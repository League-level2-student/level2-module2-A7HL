package _02_shapes_inheritance;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 * This is a Super Class/Parent Class. That means that the other classes "inherit"
 * the variables and methods from this class. 
 * 
 * The Shape class is meant to hold all the information that is the same across 
 * shapes.  For example, both a Square and Triangle have a size, so we put that 
 * in the Shape class as a member variable. Each shape needs a Robot to draw 
 * the shape so we put the setupRobot() method in here as well. 
 * 
 * Look at the other classes(Hexagon,Square,Triangle) and see if you can spot the 
 * differences between these and the ones in the _03_shapes_original package.
 */
public class Shape {
	int xLocation;
	int yLocation;
	int size;
	Color color;
	Robot rob;
	
	Shape(int xLocation, int yLocation, int size, Color color){
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
	
}
