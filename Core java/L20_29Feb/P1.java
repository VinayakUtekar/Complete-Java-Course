import java.util.Scanner;

class P1 
{
	public static void main(String[] args) 
	{
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter Students Full Name : ");
		String name = ref.nextLine();
		System.out.println("Enter Students Percentage : ");
		Double Percentage = ref.nextDouble();

		System.out.println("Students Full Name : " + name);
		System.out.println("Students Percentage : " + Percentage);
	}
}
