package compus_shop_management_system;

//product class
public class Product {
	//Attributes of the product class
	private String productId;
	private String productName;
	private String productCategory;
	private double unitPrice;
	private int quantityInStock;
	
	
	//constructor to initialize the product-details
	Product(String productId, String productName, String productCategory, double unitPrice, int quantityInStock){
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.unitPrice = unitPrice;
		this.quantityInStock = quantityInStock;
	}
	
	
	
	//Getters and Setters for all five products.
	
	
	//method to get the productId
	public String getproductId() {
		return productId;
	}
	public void setproductId(String productId) {
		this.productId = productId;
	}
	
	
	
	//methood to retrieve product Name
	public String getproductName() {
		return productName;
	}
	//method to update product Name
	public void setproductName(String productName) {
		this.productName = productName;
	}
	
	
	

	//method to set product category
	public String getproductCategory() {
		return productCategory;
	}
	//method to update product category using setter
	public void SetproductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	
	
	
	///method to get or retrieve product unite price.
	public double getunitPrice() {
		return unitPrice;
	}
	//method to update unit price. constraint(validation checks)
	public void SetunitPrice(double unitPrice) {
		if(unitPrice > 0) {
			this.unitPrice = unitPrice;
		}else {
			System.out.println("Invalid price!!");
		}
	}
	
	
	
	//method to update quantity in stock. constraint(validation checks)
	public int getquantityInStock() {
		return quantityInStock;
	}
	public void SetquantityInStock(int quantityInStock) {
			if(quantityInStock > 0) {
				this.quantityInStock = quantityInStock;
			}else {
				System.out.println("Invalid Stock quantity!!");
			}
	}
	
	

}
