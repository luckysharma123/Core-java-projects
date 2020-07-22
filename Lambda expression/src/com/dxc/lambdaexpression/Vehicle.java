package com.dxc.lambdaexpression;

public interface Vehicle {
	void drive();
	default void speed() {
	System.out.println("my car speed is 200");
}
	static void driver() {
		System.out.println("my drivername is raja");
	
	}


}
