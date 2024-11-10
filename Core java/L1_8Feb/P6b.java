class P6b
{
	public static int addition(int a, int b){
		int p = a;
		int q = b;
		int sum = p + q;
		System.out.println("Addition = " + sum);
		return sum;
	}
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		addition(a,b);
		System.out.println("Result = " + addition(a,b));
	}
} 