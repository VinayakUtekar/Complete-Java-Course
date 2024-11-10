package s29_10June;

public class P10
{
	public static void main(String args[])
	{
		int n = 5;
		for(int i=1; i<=n; i++)//rows
		{
			for(int j=1; j<=n; j++) //spaces
			{
				if(i+j <= n)
				{
					System.out.print(" ");
				}
			}
			for(int j=1; j<=n; j++) //cols
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}