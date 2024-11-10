package object_class;
import java.util.Scanner;

class Product extends Object
{
	int Pid;
	String Pname;
	double Price;
	int Pquant;
	
	public Product(int pid, String pname, double price, int pquant) 
	{
		super();
		this.Pid = pid;
		this.Pname = pname;
		this.Price = price;
		this.Pquant = pquant;
	}
	
	
	@Override
	public boolean  equals(Object obj)
	{
		Product ref = (Product) obj;
		return (this.Pname = Pname && this.Price = Price);
	}
	
	@Override
	public int hashCode()
	{
		return Pid;
	}
	
	@Override
	public String toString()
	{
		System.out.println(super.toString());
		System.out.println("Product Id : " + Pid);
		System.out.println("Product Name : " + Pname);
		System.out.println("Product Price : " + Price);
		System.out.println("Product Quantity : " + Pquant);
	}
	
	
}
public class driver2 {
Product p;
	public void datae()
	{
		Scanner sc = new Scanner(System.in);
		int pid = sc.nextInt();sc.nextLine();
		String pname = sc.nextLine();
		double price = sc.nextDouble(); sc.nextLine();
		int pquant = sc.nextInt();
		p = new Product(pid, pname, price, pquant);
		System.out.println(p.toString());
		System.out.println("Unique Number:" + p.hashCode());
	}
	
	public static void main(String [] args)
	{
		driver2 ref1 = new driver2();		
		ref1.datae();
		driver2 ref2 = new driver2();		
		ref2.datae();
		driver2 ref3 = new driver2();		
		ref3.datae();
		System.out.println(ref1.equals(ref3));
		
	}
}
