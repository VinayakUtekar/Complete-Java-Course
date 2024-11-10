class P1
{
	public static void addition(int a, int b)//Called Method //Parameterized Argument//2 Formal Arguments
	{
		int sum = a + b;
		System.out.println("Addition = " + sum);
	}
	public static void main(String[] args) // Calling Method
	{
		addition(10,20);// Method Calling Statment//Actual Arguments
		addition(25,35);
		addition(-15,-20);
		addition(0,45);
		addition(-20,20);
	}
} 