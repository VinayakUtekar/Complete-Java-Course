import java.util.Scanner;

class Employee
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

class Company
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		//Employee 1
		System.out.println("----------------------------------------------->");
		Employee ref1 = new Employee();
		System.out.println("Enter Employee 1 Id : ");
		ref1.setEmpId(sc.nextInt()); sc.nextLine();
		System.out.println("Enter Employee 1 Name : ");
		ref1.EmpName = sc.nextLine();
		System.out.println("Enter Employee 1 Salary : ");
		ref1.setSalary(sc.nextDouble());
		System.out.println("Enter Employee 1 Year of Experience : ");
		ref1.Experience = sc.nextDouble();

		//Employee 2
		System.out.println("----------------------------------------------->");
		Employee ref2 = new Employee();
		System.out.println("Enter Employee 2 Id : ");
		ref2.setEmpId(sc.nextInt()); sc.nextLine();
		System.out.println("Enter Employee 2 Name : ");
		ref2.EmpName = sc.nextLine();
		System.out.println("Enter Employee 2 Salary : ");
		ref2.setSalary(sc.nextDouble());
		System.out.println("Enter Employee 2 Year of Experience : ");
		ref2.Experience = sc.nextDouble();

		//Employee 3
		System.out.println("----------------------------------------------->");
		Employee ref3 = new Employee();
		System.out.println("Enter Employee 3 Id : ");
		ref3.setEmpId(sc.nextInt()); sc.nextLine();
		System.out.println("Enter Employee 3 Name : ");
		ref3.EmpName = sc.nextLine();
		System.out.println("Enter Employee 3 Salary : ");
		ref3.setSalary(sc.nextDouble());
		System.out.println("Enter Employee 3 Year of Experience : ");
		ref3.Experience = sc.nextDouble();

		
		System.out.println("########################################################");
		System.out.println("Employee Id : " + ref1.getEmpId());
		System.out.println("Employee Name : " + ref1.EmpName);
		System.out.println("Employee Salary : " + ref1.getSalary());
		System.out.println("Employee Year of Experience : " + ref1.Experience);
		System.out.println("########################################################");
		System.out.println("Employee Id : " + ref2.getEmpId());
		System.out.println("Employee Name : " + ref2.EmpName);
		System.out.println("Employee Salary : " + ref2.getSalary());
		System.out.println("Employee Deducted Salary : " + (ref2.getSalary() - ref2.getSalary()* 4.5 / 100));
		System.out.println("Employee Year of Experience : " + ref2.Experience);
		System.out.println("########################################################");
		System.out.println("Employee Id : " + ref3.getEmpId());
		System.out.println("Employee Name : " + ref3.EmpName);
		System.out.println("Employee Salary : " + ref3.getSalary());
		System.out.println("Employee Incremented Salary : " + (ref3.getSalary() + ref3.getSalary() * 25 / 100));
		System.out.println("Employee Year of Experience : " + ref3.Experience);
	}
}