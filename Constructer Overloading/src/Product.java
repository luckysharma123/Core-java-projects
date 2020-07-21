
public class Product {
	private long proId;
	private String productName;
	private String supplierName ;
	public Product() {
		super();
		
	}
	public Product(long proId, String productName) {
		super();
		this.proId = proId;
		this.productName = productName;
		this.supplierName = "Nivas";
	}
	public Product(long proId, String productName, String supplierName) {
		super();
		this.proId = proId;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	public long getProId() {
		return proId;
	}
	public void setProId(long proId) {
		this.proId = proId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	void display() {
		System.out.println("Product Details:");
		System.out.println("Product Id is  "+ proId + "\nProduct Name is  "+ productName + "\nSupplier Name is "+ supplierName);
		
	}
	void display1() {
		System.out.println("Product Details:");
		System.out.println("Product Id is  "+ proId + "\nProduct Name is  "+ productName );
		
	}



}
