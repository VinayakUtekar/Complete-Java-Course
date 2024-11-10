package s3_27Apr;

//WJP to find prodct of all the digits from the nhumber

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 758, prod=1;
		while(n!=0) 
		{
			int digi = n % 10;
			prod = prod*digi;
			n = n / 10;
		}
		System.out.println(prod);
	}

}
