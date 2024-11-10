class P4
{
	public static void Find(int a)//Called Method //Parameterized Argument//2 Formal Arguments
	{
		String Res = a % 2 == 0 ? "The Given Number Is Even Number" : "The Given Number Is Not a Even Number";
		System.out.println(Res);
	}
	public static void main(String[] args) // Calling Method
	{
		Find(4);
		Find(3);
		Find(2);
		Find(0);
	}
}                               
