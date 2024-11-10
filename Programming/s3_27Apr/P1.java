package s3_27Apr;

//WJP to separate digits in number of n numbers
//Itterate
//1 perform mod by 10 to get digit
//2 perform divion by 10 to get new number
//EG- n=789
//1-> 789%10 = 9  then 789/10 =78
//2-> 78%10 = 8  then 78/10 = 7
//3-> 7%10 = 7 (if LHS<RHS -> LHS is answer) then 7/10 = 0 use this 0 to exit loop

public class P1 {

	public static void main(String[] args) {
		int n = 758;
		while(n!=0) 
		{
			int digi = n % 10;
			System.out.println(digi);
			n = n / 10;
		}
	}
}