package s2_26Apr;
//Prime number in rage of 1 to 100

public class P3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1; n<=100; n++) {
			int count = 0;
			if(n ==1 ) {
				System.out.println(n + " not a prime number");
			}
			else {
				for(int i=1; i<=n; i++)
				{
					if(n % i ==0) {
						count++;
					}
				}
				if(count == 2) {
					System.out.println(n + " is a prime number");
				}
			}
		}
	}

}