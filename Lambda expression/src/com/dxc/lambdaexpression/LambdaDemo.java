package com.dxc.lambdaexpression;
public class LambdaDemo {
	public void driving(Vehicle vehicle) {
		vehicle.drive();
	}

	public static void main(String[] args) {
		LambdaDemo lambdaDemo=new LambdaDemo();
		Vehicle vehicle=()->System.out.println("This is my Car");
		lambdaDemo.driving(vehicle);
		
		Vehicle vehicledemo=new Vehicle(){
			public void drive() {
				System.out.println("anonymous class car ");
			}
		
		};
		new Vehicle() {
			public void drive() {
				System.out.println("anonymous class car");
			}
		};
	lambdaDemo.driving(vehicledemo);

}
}