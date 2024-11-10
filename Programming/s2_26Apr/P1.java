package s2_26Apr;
//All Factor of number

public class P1 {
	public static void main(String[] args) {
		int n = 25;
		for(int i=1; i<=n/2; i++)
		{
			if(n % i == 0)
			{
				System.out.println(i);
			}
		}
		System.out.println(n);
	}
}