package constructer;

public class Main {

	public static void main(String[] args) {
		
			Product prd=new Product();
			
			prd.setId(1);
			System.out.println("enter the id:\n "+prd.getId());
			
			prd.setProductname("Printer");
			System.out.println("enter product name:\n "+  prd.getProductname());
			
			prd.setSuppliername("HP");
			System.out.println("enter product supplier:\n"+prd.getSuppliername());
			
			prd.display();
			prd.product();
			prd.product(1,"Printer","HP");
			
		}


	}


