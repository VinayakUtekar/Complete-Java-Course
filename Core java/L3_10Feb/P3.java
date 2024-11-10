class P3
{
	public static double Largest(double a, double b, double c, double d)//Called Method //Parameterized Argument//2 Formal Arguments
	{
		double res = 0;
		if((a<b))
		{
			res=b;
		}
		else if(a<c)
		{
			res=c; 
		}
		else if(a<d)
		{
			res=d;
		}
		return res;
	}
	public static void main(String[] args) // Calling Method
	{
		double ans = Largest(46.5,55.9,-87.88,0);
		for(int i=1; i<=3; i++){
			System.out.println( ans );
		}
	}
}                               