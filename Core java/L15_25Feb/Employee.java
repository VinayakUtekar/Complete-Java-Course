class Employee 
{
	int emp_id;
	String emp_name;
	double sal;

	Employee()
	{
		System.out.println("--------------------------------------------->");
		System.out.println("NO-Argument Constructor");
	}

	Employee(int emp_id)
	{
		System.out.println("1 FA Constructor");
		this.emp_id = emp_id;
	}

	Employee(int emp_id, String emp_name)
	{
		System.out.println("2 FA Constructor");
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}

	Employee(int emp_id, String emp_name, double sal)
	{
		System.out.println("3 FA Constructor");
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.sal = sal;
	}

	public void employee_details()
	{
		System.out.println("Employee Id : " + this.emp_id);
		System.out.println("Employee Name : " + this.emp_name);
		System.out.println("Employee sal : " + this.sal);
		System.out.println("--------------------------------------------->");
	}

	public static void main(String[] args) 
	{
		Employee ref1 = new Employee();
		ref1.employee_details();

		Employee ref2 = new Employee(1);
		ref2.employee_details();

		Employee ref3 = new Employee(2, "Sheela");
		ref3.employee_details();

		Employee ref4 = new Employee(3, "Sheela", 39999.9);
		ref4.employee_details();

	}
}
