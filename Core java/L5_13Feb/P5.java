class P5
{
	public static void show(char a)
	{
		if(a >= 'A')
		{
			System.out.println(a);
			--a;
			show(--a);
		}
	}
	public static void main(String[] args) 
	{
		char ch = 'Z';
		System.out.println("Main Begins");
		show(ch);
		System.out.println("Main Ends"); 
	}
}
