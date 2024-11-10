class P1 {
	static int roll_no = 1;
	static String name = "Aardhya";
	double percentage = 90.00;
	boolean check = true;

	public void student()
	{
		System.out.println("Non Static-Default Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + name);
		System.out.println("percentage : " + this.percentage);
		System.out.println("check : " + this.check);

		String name = "Vinayak";
		double percentage = 86.50;

		System.out.println("Non Static-Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + P1.name);
		System.out.println("percentage : " + this.percentage);
		System.out.println("check : " + this.check);
		System.out.println("name : " + name);
		System.out.println("percentage : " + percentage);
	}

	static
	{
		P1 ref2 = new P1();

		System.out.println("Static-Default Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + name);
		System.out.println("percentage : " + ref2.percentage);
		System.out.println("check : " + ref2.check);

		String name = "Vinayak";
		double percentage = 86.50;

		System.out.println("Static-Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + P1.name);
		System.out.println("percentage : " + ref2.percentage);
		System.out.println("check : " + ref2.check);
		System.out.println("name : " + name);
		System.out.println("percentage : " + percentage);
	}

	public static void main(String[] args) 
	{
		P1 ref = new P1();
		ref.student();

		System.out.println("Main Method-Default Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + name);
		System.out.println("percentage : " + ref.percentage);
		System.out.println("check : " + ref.check);

		String name = "Vinayak";
		double percentage = 86.50;

		System.out.println("Main Method-Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + P1.name);
		System.out.println("percentage : " + ref.percentage);
		System.out.println("check : " + ref.check);
		System.out.println("name : " + name);
		System.out.println("percentage : " + percentage);

		
	}
}