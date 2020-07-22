package org.dxc.shopping;
import org.dxc.shopping.exception.ProductException;
import org.dxc.shopping.model.Product;
import org.dxc.shopping.service.CartOperation;
import org.dxc.shopping.service.CartOperationImpl;


public class ShoppingCart {

	public static void main(String[] args) throws ProductException{
		Product p1=new Product("Keyboard",400,2);
		Product p2=new Product("Pendrive",300,2);
		Product p3=new Product("Camera",3000,1);
		Product p4=new Product("Mouse",400,3);
		Product p5=new Product("Memorycard",300,1);
		Product p6=new Product("Mobile",30000,1);
		
		CartOperation cartService=new CartOperationImpl(25); 
		
		cartService.addToCart(p1);
		cartService.addToCart(p2); 
		cartService.addToCart(p3); 
		cartService.addToCart(p4);
		cartService.addToCart(p5); 
		cartService.addToCart(p6); 
		System.out.println(cartService.getInvoiceAmount());
		
		cartService.removeFromCart(p1);
		System.out.println(cartService.getInvoiceAmount());
		System.out.println(cartService); 
		
		int size=cartService.getProductContainerSize();
		
		System.out.println(size);
		
		

	}
	
}	

	


