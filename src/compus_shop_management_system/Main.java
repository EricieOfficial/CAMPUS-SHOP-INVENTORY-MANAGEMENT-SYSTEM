package compus_shop_management_system;

public class Main {
	
	//Method that makes product class accessible by the main class
	
	public static void displayProduct(Product product) {
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("Product ID:"+" "+product.getproductId());
		System.out.println("Product Name:"+" "+product.getproductName());
		System.out.println("Product Category:"+" "+product.getproductCategory());
		System.out.println("Product Unit Price:"+" "+product.getunitPrice());
		System.out.println("Product Stock Quantity:"+" "+product.getquantityInStock());
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create product objects
		Product pencils = new Product("Q001","Color pencils","Stationery",12000,50);
		Product pens = new Product("Q002","pen","stationery",500,200);
		Product exercise_book = new Product("Q003","Counter Book","Stationery",8000,50);
		Product printing_paper = new Product("Q004","plane papers","printing & paper Supplies",2500,30);
		Product calculators = new Product("Q005","calculators","Electronics",55000,10);	
		Product flash_disk = new Product("Q006","flash disks","Electronics",30000,20);
		Product files = new Product("Q007","files","Stationery",5000, 80);
		
	
	
		
	// The displays the header that show what the system is all about.
	System.out.println("=========================== COMPUS INVENTORY SHOP =====================");
	
	
	//displays product-details for all the called products 
	System.out.println("****AVAILABLE PRODUCTS****");
	
	displayProduct(pencils);
	displayProduct(pens);
	displayProduct(exercise_book);
	displayProduct(printing_paper);
	displayProduct(calculators);
	displayProduct(flash_disk);
	displayProduct(files);

	
	
	//Updated product-details using setters.
	System.out.println("=======================================================");
	System.out.println("=== PRODUCT DETAIL UPDATE USING GETTERS (UNITPRICE) ===");
	System.out.println("=======================================================");
	
	exercise_book.SetunitPrice(20000);
	displayProduct(exercise_book);
	
	
	printing_paper.SetunitPrice(1000);
	displayProduct(printing_paper);
	
	
	
	//Here a demonstration of an invalid updating of product details and assigned validation
	System.out.println("====================================================");
	System.out.println("========= PRODUCT VALIDATION TESTING ===============");
	System.out.println("====================================================");
	
	// Note: System displays invalid price!!, invalid stock quantity!! when invalid values are set to update.
	//however, it redisplays original state.
	
	//updating unit price with invalid number
	pens.SetunitPrice(-60000);
	displayProduct(pens);
	

	System.out.println("=====================================================");
	
	flash_disk.SetunitPrice(-15000);
	displayProduct(flash_disk);
	
	System.out.println("=====================================================");
	
	//updating quantity using invalid number.
	calculators.SetquantityInStock(-500);
	displayProduct(calculators);
	
	System.out.println("=====================================================");
	
	//updating quantity using invalid number.
	files.SetquantityInStock(-2000);
	displayProduct(files);


	

}

}
