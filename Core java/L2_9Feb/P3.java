class P3
{
	public static void Find(int a)//Called Method //Parameterized Argument//2 Formal Arguments
	{
		int Res = a % 2;
		if(Res == 0)
		{
			System.out.println("The Given Number Is Even Number");
		}
		else{
			System.out.println("The Given Number Is Not a Even Number");
		}
	}
	public static void main(String[] args) // Calling Method
	{
		Find(4);
		Find(3);
		Find(2);
		Find(0);
	}
}                               
