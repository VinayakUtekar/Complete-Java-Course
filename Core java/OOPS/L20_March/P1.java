import java.util.Scanner;

class ICICIBank
{
	private String branch;
	private String IFSC;

	ICICIBank(String branch, String IFSC)
	{
		this.branch = branch;
		this.IFSC = IFSC;
	}

	public String getBranch()
	{
		return branch;
	}

	public String getIFSC()
	{
		return IFSC;
	}
}

class LoanAccount extends ICICIBank
{
	private double LoanAmount;
	private double tenure;
	
	LoanAccount(String branch, String IFSC, double LoanAmount, double tenure)
	{
		super(branch,IFSC);
		this.LoanAmount = LoanAmount;
		this.tenure = tenure;
	}

	public void details()
	{
		System.out.println("--------------------------------------------------->");
		System.out.println("Branch : " + getBranch());
		System.out.println("IFSC Code : " + getIFSC());
		System.out.println("Loan Amount : " + LoanAmount);
		System.out.println("tenure : " + tenure);
	}
}

class CurrentAccount extends ICICIBank
{
	private String AccHolderName;
	private String AccNumber;
	
	CurrentAccount(String branch, String IFSC, String AccHolderName, String AccNumber)
	{
		super(branch, IFSC);
		this.AccHolderName = AccHolderName;
		this.AccNumber = AccNumber;
	}

	public void details()
	{
		System.out.println("--------------------------------------------------->");
		System.out.println("Branch : " + getBranch());
		System.out.println("IFSC Code : " + getIFSC());
		System.out.println("Account Holder Name : " + AccHolderName);
		System.out.println("Account Number : " + AccNumber);
	}
}

class P1
{
	LoanAccount l;
	CurrentAccount c;
	
	public void CurrentAccdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------------->");
		System.out.println("Enter Branch : ");
		String branch = sc.nextLine();
		System.out.println("Enter IFSC : ");
		String IFSC = sc.nextLine();
		System.out.println("Enter Account Holder Name : ");
		String AccHolderName = sc.nextLine();
		System.out.println("Enter Account Number : ");
		String AccNumber = sc.nextLine();
		c = new CurrentAccount(branch, IFSC, AccHolderName, AccNumber);
	}

	public void LoanAccdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------------->");
		System.out.println("Enter Branch : ");
		String branch = sc.nextLine();
		System.out.println("Enter IFSC : ");
		String IFSC = sc.nextLine();
		System.out.println("Enter Loan Amount : ");
		double LoanAmount = sc.nextDouble();sc.nextLine();
		System.out.println("Enter Tenure : ");
		double Tenure = sc.nextDouble();sc.nextLine();
		l = new LoanAccount(branch, IFSC, LoanAmount, Tenure);
	}

	public static void main(String[] args) 
	{
		P1 LA1 = new P1();
		LA1.LoanAccdata();
		P1 LA2 = new P1();
		LA2.LoanAccdata();
		P1 LA3 = new P1();
		LA3.LoanAccdata();

		LA1.l.details();
		LA2.l.details();
		LA3.l.details();

		P1 CA1 = new P1();
		CA1.CurrentAccdata();
		P1 CA2 = new P1();
		CA2.CurrentAccdata();
		P1 CA3 = new P1();
		CA3.CurrentAccdata();

		CA1.c.details();
		CA2.c.details();
		CA3.c.details();
	}
}
