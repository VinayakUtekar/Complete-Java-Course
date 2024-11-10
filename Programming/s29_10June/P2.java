package s29_10June;

public class P2
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)//rows
		{
			for(int j=1; j<=5; j++) //cols
			{
				if(i==1 || i==5 || j==1 || j==5)
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