import java.util.Scanner;

class P2 
{
	public static void main(String[] args) 
	{
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter Students Percentage : ");
		Double Percentage = ref.nextDouble();
		ref.nextLine();

		System.out.println("Enter Students Full Name : ");
		String name = ref.nextLine();

		System.out.println("Students Percentage : " + Percentage);
		System.out.println("Students Full Name : " + name);
	}
}