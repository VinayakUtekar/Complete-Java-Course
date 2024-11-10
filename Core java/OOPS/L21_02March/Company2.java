import java.util.Scanner;

class Employee2
{
	private int EmpId;
	String EmpName;
	private double Salary;
	double Experience;

	public int getEmpId()
	{
		return EmpId;
	}

	public double getSalary()
	{
		return Salary;
	}

	public void setEmpId(int EmpId)
	{ 
		this.EmpId = EmpId;
	}

	public void setSalary(double Salary)
	{ 
		this.Salary = Salary;
	}

}

class Company2
{
	Employee2 e;
	public void data()
	{
		Scanner sc = new Scanner(System.in);
		e = new Employee();
		System.out.println("----------------------------------------------->");
		System.out.println("Enter Employee Id : ");
		e.setEmpId(sc.nextInt()); sc.nextLine();
		System.out.println("Enter Employee Name : ");
		e.EmpName = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		e.setSalary(sc.nextDouble());
		System.out.println("Enter Employee Year of Experience : ");
		e.Experience = sc.nextDouble();
	}

	public void details()
	{
		System.out.println("########################################################");
		System.out.println("Employee Id : " + e.getEmpId());
		System.out.println("Employee Name : " + e.EmpName);
		System.out.println("Employee Salary : " + e.getSalary());
		System.out.println("Employee Year of Experience : " + e.Experience);
	}

	public static void main(String[] args) 
	{
		//Employee 1
		Company2 ref1 = new Company2();
		ref1.data();

		//Employee 2
		Company2 ref2 = new Company2();
		ref2.data();
		
		//Employee 3
		Company2 ref3 = new Company2();
		ref3.data();

		
		ref1.details();
		
		ref2.details();
		System.out.println("Employee Deducted Salary : " + (ref2.e.getSalary() - ref2.e.getSalary()* 4.5 / 100));

		ref3.details();
		System.out.println("Employee Incremented Salary : " + (ref3.e.getSalary() + ref3.e.getSalary() * 25 / 100));
	}
}