package _05_overriding;

/*
 * We should see a regular pizza and a pepperoni pizza
 */
public class PizzaRunner {
	public static void main(String[] args) {
		Pizza p = new Pizza();
		p.make();
		p.show();
		p.receipt();
		
		PepperoniPizza pp = new PepperoniPizza();
		pp.make();
		pp.show();
		pp.receipt();
	}
}
