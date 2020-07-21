package DesignPattern.hamburger;

public class SimpleHamburgerFactory {
	public Hamburger getInstance(String burgerType) {
		if(burgerType.equals("VeggieBurger"))
		{
		return new VeggieBurger();
     	}
		else if(burgerType.equals("CheeseBurger")) {
			return new CheeseBurger();
		}
		else if(burgerType.equals("MeatLoverBurger")) {
			return new MeatLoverBurger();
		}
		return null ;

}

}
