package Exceptions;

class MyOwnException extends RuntimeException
{
}

class Payment                                         
{
	Payment(boolean str)
	{
			if(str==true)	
			{
				System.out.println("Payement Successful");
			}
			else	
			{
				throw new MyOwnException();
			}
	}
}

public class E6 {

	public static void main(String[] args) {
		System.out.println("Program runs");
		Payment ref = new Payment(false);
	}

}
