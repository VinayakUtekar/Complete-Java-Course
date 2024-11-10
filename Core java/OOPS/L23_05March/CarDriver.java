import java.util.Scanner; //Import Scanner

class vehicle //Parent//SuperClass
{
	String VehicleNo; //Non Static Variable//State
	String VehicleBrand;  //Non Static Variable//State
	double VehiclePrice;  //Non Static Variable//State

	public void VehicleDetails() //Method//Behaviour
	{
		System.out.println("------------------------------------------------>");
		System.out.println("Vehicle No : " + VehicleNo);
		System.out.println("Vehicle Brand : " + VehicleBrand);
		System.out.println("Vehicle Price : " + VehiclePrice);
	}
}

class Car extends vehicle //Child//SubClass
{
	Car(String VehicleNo, String VehicleBrand, double VehiclePrice)
	{
		//Variable Initilization
		this.VehicleNo = VehicleNo;
		this.VehicleBrand = VehicleBrand;
		this.VehiclePrice = VehiclePrice;
	}
}

class CarDriver //DriverClass
{
	Car a;
	public void data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------->");
		System.out.println("Enter Vehicle Id : ");
		String id = sc.nextLine();
		System.out.println("Enter Vehicle Brand : ");
		String brand = sc.nextLine();
		System.out.println("Enter Vehicle Price : ");
		double price = sc.nextDouble();
		a = new Car(id, brand, price);
	}

	public static void main(String[] args) 
	{
		CarDriver ref1 = new CarDriver();
		ref1.data();
		CarDriver ref2 = new CarDriver();
		ref2.data();
		CarDriver ref3 = new CarDriver();
		ref3.data();
		CarDriver ref4 = new CarDriver();
		ref4.data();
		CarDriver ref5 = new CarDriver();
		ref5.data();

		ref1.a.VehicleDetails();
		ref2.a.VehicleDetails();
		ref3.a.VehicleDetails();
		ref4.a.VehicleDetails();
		ref5.a.VehicleDetails();
	}
}
