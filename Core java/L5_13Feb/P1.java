class P1 
{
	public static void display(int num)
	{
		if(num<=222)
		{
			System.out.println(num); 
			display(num+1); //(++num)
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Begins");
		int num = 22;
		display(22);
		System.out.println("Main Ends");
	}
}
