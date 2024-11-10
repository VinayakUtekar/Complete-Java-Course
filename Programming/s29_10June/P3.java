package s29_10June;

public class P3
{
	public static void main(String args[])
	{
		int n = 9;
		for(int i=1; i<=n; i++)//rows
		{
			for(int j=1; j<=n; j++) //cols
			{
				if(i==n/2+1 || j==n/2+1)
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