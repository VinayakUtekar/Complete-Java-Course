package s3_27Apr;

//WJP to diplay only even digi from number

public class P2 {
	public static void main(String[] args) {
		int n = 758;
		while(n!=0) 
		{
			int digi = n % 10;
			if(digi % 2 == 0) {
			System.out.println(digi);
			}
			n = n / 10;
		}
	}
}