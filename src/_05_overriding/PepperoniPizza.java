package _05_overriding;

/*
 * GOAL: Override the show() and receipt() methods from Pizza
 */
public class PepperoniPizza extends Pizza {
	// 1. Copy the show() method from Pizza, but change it so it shows a Pepperoni Pizza 
	@Override
	public void show() {
		frame.setTitle("Pepperoni Pizza");
		label.setIcon(loadImage("pepperoniPizza.png"));
	}
	// 2. Add @Override above the method
	//	  This helps with preventing errors(you can ask your teacher for further explanation)
	
	
	// 3. Copy the receipt() method from Pizza, but change it so a Pepperoni Pizza is $12
	@Override
	public void receipt() {
		System.out.println("You purchased a Pepperoni Pizza for $12");
	}
	// 4. Add the @Override tag
	
	
}
