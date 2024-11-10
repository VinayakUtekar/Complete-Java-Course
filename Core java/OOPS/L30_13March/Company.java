class SeniorSoftwareEngineer
{
	private String SName;
	private int SDeptNo;
	private String SDesi;

	SeniorSoftwareEngineer(String SName, int SDeptNo, String SDesi)
	{
		this.SName = SName;
		this.SDeptNo = SDeptNo;
		this.SDesi = SDesi;
	}

	public void WorkingStyle()
	{
		System.out.println("Seniors are Working");
	}

	public String getSName()
	{return SName;}

	public int getSDeptNo()
	{return SDeptNo;}

	public String getSDesi()
	{return SDesi;}
}

class JuniorSoftwareEngineer extends SeniorSoftwareEngineer
{
	private String JName;
	private int JDeptNo;
	private String JDesi;

	JuniorSoftwareEngineer(String SName, int SDeptno, String SDesi,String JName, int JDeptNo, String JDesi)
	{
		super(SName, SDeptno, SDesi);
		this.JName = JName;
		this.JDeptNo = JDeptNo;
		this.JDesi = JDesi;
	}

	public void WorkingStyle()
	{
		System.out.println("Juniors are Working on thier Skills");
	}

	public void Details()
	{
		System.out.println("Senior Engineer Name : " + getSName());
		System.out.println("Senior Engineer Dept No : " + getSDeptNo());
		System.out.println("Senior Engineer Designation : " + getSDesi());
		System.out.println("Junior Engineer Name : " + JName);
		System.out.println("Junior Engineer Dept No : " + JDeptNo);
		System.out.println("Junior Engineer Designation : " + JDesi);
	}
}

class Company
{
	public static void main(String[] args)
	{
	SeniorSoftwareEngineer ref = new JuniorSoftwareEngineer("Vinayak", 5551, "Manager", "Omkar", 54653, "jr.Manager");
	ref.WorkingStyle();
	JuniorSoftwareEngineer ref1 = (JuniorSoftwareEngineer) ref;
	ref1.Details();
	}
}
