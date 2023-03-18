package _02_shapes_inheritance;

import java.awt.Color;

/*
 * This package of classes is very similar to what you just saw, except it uses inheritance.
 * Inheritance can be thought of as a parent and child relationship. The child inherits some of its 
 * parent's traits, such as eye or hair color.  The same thing is true for code. 
 * Inheritance is where one class "inherits"/gets the variables and methods of another class.
 * This means the classes will share some of the same variables and methods, just like a parent
 * and child can share the same eye color.
 * 
 * As you can see the ShapeRunner class is identical to the previous one. Run the code.
 * It is the same result as the previous code. 
 * 
 * However, we now have a new class in this package called Shape. Go take a look at it.
 */
public class ShapeRunner {
	public static void main(String[] args) {
		Square sq = new Square(200,450,400,Color.BLUE);
		sq.setupRobot();
		sq.draw();
		
		Hexagon hex = new Hexagon(225,350,200,Color.RED);
		hex.setupRobot();
		hex.draw();
		
		Triangle tri = new Triangle(325,375,250,Color.GREEN);
		tri.setupRobot();
		tri.draw();
	}
}
