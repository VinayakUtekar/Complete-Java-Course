class P3 
{
	public static void display(int num)
	{
		if(num<=111)
		{
			if(num%2!=0)
			{
				System.out.println(num);
			}
			display(num+1); //(++num)
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Begins");
		int num = 11;
		display(11);
		System.out.println("Main Ends");
	}
}
