class  P6
{
	static char vare;
	static boolean vare2;
	public static void main(String[] args) 
	{
		String vare = "QSpider";
		System.out.println("vare : " + P6.vare);
		System.out.println("vare2 : " + P6.vare2);
		System.out.println("vare : " + vare);
		P6.vare = 'A';
		vare2 = true;
		System.out.println("vare : " + P6.vare);
		System.out.println("vare2 : " + P6.vare2);
		System.out.println("vare : " + vare);
	}
}