class P1 
{
	public void car()
	{
		System.out.println("Which Colour Is You Buggati");
		System.out.println("this : " + this);
		System.out.println("Mine Is Blue");
	}
	public static void main(String[] args) 
	{
		System.out.println("World Created");
		P1 ref = new P1();
		System.out.println("ref : " + ref);
		ref.car();
		System.out.println("World Ended");
	}
}
