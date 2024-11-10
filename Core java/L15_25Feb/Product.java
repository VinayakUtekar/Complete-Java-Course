class Product 
{
	int prd_id;
	String prd_name;
	String prd_brand;
	double price;

	Product(int prd_id, String prd_name, String prd_brand, double price)
	{
		this.prd_id = prd_id;
		this.prd_name = prd_name;
		this.prd_brand = prd_brand;
		this.price = price;
	}

	public void product_details()
	{
		System.out.println("Product Id : " + this.prd_id);
		System.out.println("Product Name : " + this.prd_name);
		System.out.println("Product Brand : " + this.prd_brand);
		System.out.println("Product Price : " + this.price);
		System.out.println("--------------------------------------------->");
	}

	public static void main(String[] args) 
	{
		Product ref1 = new Product(1, "Bat", "SM", 4500.50);
		ref1.product_details();
		Product ref2 = new Product(2, "Ball", "SG", 100.50);
		ref2.product_details();
		Product ref3 = new Product(3, "Stumps", "Asc", 120000.50);
		ref3.product_details();

	}
}
