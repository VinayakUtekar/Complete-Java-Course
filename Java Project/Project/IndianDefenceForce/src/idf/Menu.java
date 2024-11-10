package idf;

import java.util.Scanner;

public class Menu implements Login{
	
	private String fname;
	private String lname;
	private String address;
	private String email;
	private String password;
	static long mno;
	
	static double totalPrice;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMno() {
		return mno;
	}
	public void setMno() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter mobile");
		long mno=s.nextLong();
		if(mno>999999999 && mno<10000000000L) {
			this.mno = mno;
		}else {
		//	System.err.println("invalid mobile number");
			System.err.println("enter valid 10 digit mobile number");
			setMno();//method-recursion
		}
		
	}
	@Override
	public void singup() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first name");
		String fname=s.next();
		setFname(fname);
		System.out.println("enter last name");
		String lname=s.nextLine();
		lname=s.nextLine();
		setLname(lname);
		System.out.println("enter your address");
		String address=s.nextLine();
		setAddress(address);
		System.out.println("enter email Id");
		String email=s.nextLine();
		setEmail(email);
		System.out.println("enter your password");
		String pwd=s.next();
		setPassword(pwd);
		setMno();
		System.out.println("singup sucessfull");
		System.out.println("procedd for login");
		login();
	}
	@Override
	public void login() {
		if(fname != null) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1. Login with mobile number");
		System.out.println("2.Login with email Id");
		int a=s.nextInt();
		if(a==1) {
			System.out.println("enter registered mobile number");
			long mno=s.nextLong();
			System.out.println("enter your password");
			String pwd=s.next();
			
			if(this.mno==mno && this.password.equals(pwd)) {
				System.out.println("login sucessfulll");
			}else{
				System.err.println("invalid mobile or password");
				login();
			}
			
		}
		else if(a==2) {
			System.out.println("enter your email id");
			String email=s.next();
			System.out.println("enter your password");
			String pwd=s.next();
			if(this.email.equals(email) && this.password.equals(pwd)) {
				System.out.println("login sucessfulll");
				
			}else {
				System.err.println("invalid email id or password");
				login();
			}
				
			}else {
				System.err.println("invalid input");
				login();
			}
		}else {
			System.err.println("First create Account for loging");
			singup();
		}
			
	}
	
	public void Forces() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Indian Army");
		System.out.println("2.Indian Air Force");
		System.out.println("3.Indian Navy");
		System.out.println("4.Indian Coast Guard");
		System.out.println("5.Central Armed Police Force");
		System.out.println("6.Other Forces");
		System.out.println("7.Exit");
		int a=s.nextInt();
		switch (a) {
		case 1: {
			Indian_Army INA = new Indian_Army();
			INA.menu();
			break;
		}
		case 2:{
			Indian_AirForce IAF = new Indian_AirForce();
			IAF.menu();
			break;
		}
		case 3: {
			Indian_Navy INY = new Indian_Navy();
			INY.menu();
			break;
		}
		case 4:{
			Indian_AirForce IAF = new Indian_AirForce();
			IAF.menu();
			break;
		}
		case 5: {
			Indian_Army INA = new Indian_Army();
			INA.menu();
			break;
		}
		case 6:{
			Indian_AirForce IAF = new Indian_AirForce();
			IAF.menu();
			break;
		}
		case 7:{
			System.out.println("Thank you");
			System.exit(0);
		}
		default:
			System.err.println("Enter valid Input");
			Forces();
		}
		
	}
}