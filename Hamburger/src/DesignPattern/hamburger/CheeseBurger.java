package DesignPattern.hamburger;

public class CheeseBurger extends Hamburger {

	@Override
	void prepare() {
		System.out.println("Preparing your CheeseBurger....  ");
		
	}

	@Override
	void cook() {
		System.out.println("Cooking in progress.....");
		
	}

	@Override
	void box() {
		System.out.println("Almost done...CheeseBurger is packed....");
		
	}

}
