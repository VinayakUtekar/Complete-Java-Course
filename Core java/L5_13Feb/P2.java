class P2
{
	public static void display(int num)
	{
		if(num<=8765 && num>=65)
		{
			System.out.println(num); 
			display(--num); //(++num)
		}
	}

	public static void main(String[] args) 
	{ 
		System.out.println("Main Begins");
		int num = 8765;
		display(8765);
		System.out.println("Main Ends");
	}
}
