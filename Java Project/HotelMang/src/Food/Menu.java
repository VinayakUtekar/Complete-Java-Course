package Food;

import java.util.Scanner;

public class Menu {
	
	private String fname;
	private String lname;
	private String address;
	private String email;
	private String password;
	private long mno;
	
	public String getFname()
	{
		return fname;
	}
	
	public String getLname() 
	{
		return lname;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public long getMno() 
	{
		return mno;
	}
	
	public void setFname(String fname) 
	{
		this.fname=fname;
	}
	
	public void setLname(String lname) 
	{
		this.lname=lname;	
	}
	
    public void setAddress(String address) 
    {
    	this.address=address;
	}
    
    public void setEmail(String email) 
    {
    	this.email=email;
    }
    
    public void setPassword(String password) 
    {
    	this.password=password;
    }
    public void setMno() 
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter your Mobile number.");
    	long mno = s.nextLong();
    	if (mno > 999999999 && mno < 10000000000L) {
    		this.mno=mno;	
    	} else {
    		System.err.println("Invalid Mobile number");
    		System.err.println("Enter valid 10 digit Mobile number");
    		setMno();
    	}
    	
    }

	public void signup() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First name.");
		String fname=s.next();
		s.nextLine();
		setFname(fname);
		System.out.println("Enter Last name.");
		String lname=s.nextLine();
		setLname(lname);
		System.out.println("Enter your Address.");
		String address = s.nextLine();
		setAddress(address);
		System.out.println("Enter your Email.");
		String email =s.nextLine();
		setEmail(email);
		System.out.println("Enter your password.");
		String password=s.nextLine();
		setPassword(password);
		setMno();
		
		System.out.println("Signup Successfull!!");
		System.out.println("Proceed to Login!!");
	}
    
}