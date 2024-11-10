package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

class student{
	int rollno;
	String name;
	double marks;
	
	student(int rollno,String name,double marks){
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return "Rollno: " + rollno + " ; " + "Name: " + name + " ; " + "Marks: " + marks;
	}
}


public class Assignment5 {
	public static void main(String[] args) {
		
	
	
	ArrayList<student>  a = new ArrayList<student>();
	
	a.add(new student(1,"Sawarn Singh",9.48));
	a.add(new student(2,"Vinayak",9.18));
	a.add(new student(3, "Sahil",8.56 ));
	a.add(new student(4,"Tanisq",8.89));
	a.add(new student(5,"Ayush",7.89));
	
	ListIterator l = a.listIterator(); 
		while(l.hasNext()) {
		System.out.println(l.next());
		}
		
	}
}
