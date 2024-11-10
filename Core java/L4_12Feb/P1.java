class Calculator
{
	public static double addition (double a, double b)
	{
		double res = a + b;
		return res;
	}
	public static double addition (double a, double b, double c)
	{
		double res = a + b + c;
		return res;
	}
	public static double addition (double a, double b, double c, double d)
	{
		double res = a + b + c+ d;
		return res;
	}
	public static double addition (double a, double b, double c, double d, double e)
	{
		double res = a + b + c + d + e ;
		return res;
	}
	public static double addition (double a, double b, double c, double d, double e, double f)
	{
		double res = a + b + c + d + e + f;
		return res;
	}
	public static void main(String [] args)
	{
		double res1 = addition(10,20);
		System.out.println(res1);
		double res2 = addition(10,20,30);
		System.out.println(res2);
		double res3 = addition(10,20,30,40);
		System.out.println(res3);
		double res4 = addition(10,20,30,40,50);
		System.out.println(res4);
		double res5 = addition(10,20,30,40,50,60);
		System.out.println(res5);
	}
}