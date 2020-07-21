package constructer;

public class Product {
	long id;
	String productname;
	String suppliername;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
     void product() {
    	 System.out.println("default constructor");
	}
     void product(long id, String productname, String suppliername) {
    	 
    	 System.out.println("details= "+id + productname + suppliername);
     }
	void display() {
		System.out.println("Product Details:");
		System.out.println("Product Id is 1 \r\n" + "Product Name is Printer \r\n" + "Supplier Name is HP \r\n");
		
	}


}
