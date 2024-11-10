package s29_10June;

public class P4
{
	public static void main(String args[])
	{
		int n = 5;
		for(int i=1; i<=n; i++)//rows
		{
			for(int j=1; j<=n; j++) //cols
			{
//				if(i==n/2+1 || j<=n/2+1 || i==n || (j==n && i>=n/2+1) || (j==1 && i>=n/2+1))
//				if(i==n || i==n/2+1 || (j==n/2+1 && j<=n/2+1) )
//				((j==1 && i>=3) || (j==5 && i>=3))
//				can be written as
//				((j==1 || j==5) && i>=3) 
				if(i==n/2+1 || i==n || ((j==1 || j==n) && i>=n/2+1) || (j==n/2+1 && i<=n/2+1))
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