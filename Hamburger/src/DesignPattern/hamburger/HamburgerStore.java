package DesignPattern.hamburger;

public class HamburgerStore {

	public static void main(String[] args) {
		SimpleHamburgerFactory  hamburgerFactory= new SimpleHamburgerFactory();
		Hamburger hamburger1=hamburgerFactory.getInstance("VeggieBurger");
		System.out.println(".................................................................");
		hamburger1.prepare();
		hamburger1.cook();
		hamburger1.box();
		System.out.println("VeggieBurger is ready ");
		System.out.println("Have a Yummy day ");
		System.out.println(".................................................................");
		Hamburger hamburger2=hamburgerFactory.getInstance("CheeseBurger");
		hamburger2.prepare();
		hamburger2.cook();
		hamburger2.box();
		System.out.println("CheeseBurger is ready ");
		System.out.println("Have a Yummy day ");
		System.out.println(".................................................................");
		Hamburger hamburger3=hamburgerFactory.getInstance("MeatLoverBurger");
		hamburger3.prepare();
		hamburger3.cook();
		hamburger3.box();
		System.out.println("MeatLoverBurger is ready ");
		System.out.println("Have a Yummy day ");
		System.out.println(".................................................................");
		}

	}


