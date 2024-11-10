class Product 
{
	int prd_id;
	String prd_name;
	String prd_brand;
	double price;

	Product()
	{
		System.out.println("No Argument Constructor");
	}

	Product(int prd_id)
	{
		System.out.println("1 FA Constructor");
		this.prd_id = prd_id;
	}

	Product(int prd_id, String prd_name)
	{
		this(prd_id);
		System.out.println("2 FA Constructor");
		this.prd_name = prd_name;
	}

	Product(int prd_id, String prd_name, String prd_brand)
	{
		this(prd_id, prd_name);
		System.out.println("3 FA Constructor");
		this.prd_brand = prd_brand;
	}

	Product(int prd_id, String prd_name, String prd_brand, double price)
	{
		this(prd_id, prd_name, prd_brand);
		System.out.println("4 FA Constructor");
		this.price = price;
	}

	public void product_details()
	{
		System.out.println("Product Prd_id : " + this.prd_id);
		System.out.println("Product Prd_name : " + this.prd_name);
		System.out.println("Product Prd_brand : " + this.prd_brand);
		System.out.println("Product Price : " + this.price);
		System.out.println("--------------------------------------------->");
	}

	public static void main(String[] args) 
	{
		Product ref1 = new Product(1, "Bat", "SM", 4500.50);
		ref1.product_details();
	}
}