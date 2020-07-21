import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Product p=new Product();
		Scanner s = new Scanner(System.in);
		p.setProId(1);
		System.out.println("Enter the product id  " + p.getProId());
		p.setProductName("printer");
		System.out.println("Enter the product name  " + p.getProductName());
		System.out.println("The product is supplied by Nivas Suppliers?-yes or no");
		String t =  s.nextLine();
		if(t.equals("yes"))
		{
			p.display1();
			System.out.println("SupplierName is Nivas");
			
		}
		else
		{
		System.out.println("Enter the suppliername");
		p.setSupplierName(s.nextLine());	
		p.display();
		}

	}


	}


