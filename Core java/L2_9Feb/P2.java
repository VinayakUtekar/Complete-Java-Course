class P2
{
	public static void Multiplication(int a, int b, int c, int d, int e)//Called Method //Parameterized Argument//2 Formal Arguments
	{
		int mul = a * b * c * d * e;
		System.out.println("Multiplication = " + mul);
	}
	public static void main(String[] args) // Calling Method
	{
		Multiplication(1,2,3,4,5);// Method Calling Statment//Actual Arguments
		Multiplication(2,2,2,2,2);
		Multiplication(-1,-2,-3,-4,-5);
		Multiplication(-1,2,-3,4,-5);
		Multiplication(-1,2,3,4,-5);
	}
} 