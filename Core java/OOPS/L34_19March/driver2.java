import java.util.Scanner;

class Customer {
	int CId;
	String name;
	int PhNum;
	
	Customer(int CId, String name, int PhNum)
	{
		this.CId = CId;
		this.name = name;
		this.PhNum = PhNum;
	}
	
	@override
	public String toString()
	{
		System.out.println(super.toString());
		System.out.println("id : " + CId);
		System.out.println("Name: " + name);
		System.out.println("Phone Number: " + PhNum);	
	}
}

class driver2
{
	Customer c;
	public static void datae()
	{
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt(); sc.nextLine();
		String name = sc.nextLine();
		int Phnum = sc.nextInt();
		c = new Customer(id, name, Phnum);
	}
	public static void main(String [] args)
	{
		driver2 ref1 = new driver2();
		ref1.datae();
		ref1.toString();

	}
}
 

