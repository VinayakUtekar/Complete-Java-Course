class IndianArmedForces
{
	private String id;
	private String name;
	private String address;
	private String rank;
	private int number;
	private int aadhar;
	private String codename;

	IndianArmedForces(String id,String name, String address, String rank, int number, int aadhar, String codename)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.rank = rank;
		this.number = number;
		this.aadhar = aadhar;
		this.codename = codename;
	}


}

class IndianArmy extends IndianArmedForces
{

}

class IndianAirForce extends IndianArmedForces
{

}

class IndianNavy extends IndianArmedForces
{

}

class Project 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
