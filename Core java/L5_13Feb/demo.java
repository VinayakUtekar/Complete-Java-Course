class demo 
{
	public static void display(int num)
	{
		int x = 0;
		if((num<=111)&&(x<0))
		{
			if(num%2!=0)
			{
				System.out.println(num);
			}
			x = display(num+1); //(++num)
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
