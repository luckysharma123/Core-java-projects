package DesignPattern.hamburger;

public class MeatLoverBurger extends Hamburger {
	@Override
	void prepare() {
		System.out.println(" Preparing your MeatLoverBurger....  ");
		
	}

	@Override
	void cook() {
		System.out.println("Cooking in progress.....");
		
	}

	@Override
	void box() {
		System.out.println("Almost done...MeatLoverBurger is packed...");
		
	}

}
