package DesignPattern.hamburger;

public class VeggieBurger extends Hamburger {
	@Override
	void prepare() {
		System.out.println("Preparing your VeggieBurger....  ");
		
	}

	@Override
	void cook() {
		System.out.println("Cooking in progress.....");
		
	}

	@Override
	void box() {
		System.out.println("Almost done...VeggieBurger is packed...");
		
	}
	

}

