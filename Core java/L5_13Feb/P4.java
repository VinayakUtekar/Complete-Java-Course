class P4
{
	public static void show(char a)
	{
		if(a <= 'Z')
		{
			System.out.println(a);
			show(++a);
		}
	}
	public static void main(String[] args) 
	{
		char ch = 'A';
		System.out.println("Main Begins");
		show(ch);
		System.out.println("Main Ends"); 
	}
}
