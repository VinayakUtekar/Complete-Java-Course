package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class C7 {
	public static void main(String [] args)
	{
		ArrayList mi = new ArrayList();
		ArrayList csk = new ArrayList();
		System.out.println("Enter Mumbai Indians Playing 11: ");
		for(int i=0; i<11; i++)
		{
			
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			mi.add(name);
		}
		
		System.out.println("Enter CSK Playing 11: ");
		for(int i=0; i<11; i++)
		{
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			csk.add(name);
		}
		System.out.println(mi);
		System.out.println(csk);
		
		if(csk.contains("dhoni")) {
			System.out.println("Thala is back");
		}
		else {
			System.out.println("Oh sad news, Dhoni is not playing anymore...");
		}
			
		if(mi.contains("hardik")) {
			System.out.println("Management decision is not appropriate");
		}
		else {
			System.out.println("Wow amazing good to hear for MI Fans...");
		}
		
		
		if(mi.contains("hardik")) {
			mi.remove("hardik");
			System.out.println("Rohit is back...");
		}
		
		mi.addAll(csk);
		System.out.println("All Mi players in forward:");
		for(int i=0; i<11; i++)
		{
			System.out.println(mi.get(i));
		}
		System.out.println("All Mi players in reverse:");
		for(int i= mi.size()-1; i>=0; i--)
		{
			System.out.println(mi.get(i));
		}
		
		
		System.out.println("All csk players in forward:");
		for(int i=0; i<11; i++)
		{
			System.out.println(csk.get(i));
		}
		System.out.println("All csk players in reverse:");
		for(int i= csk.size()-1; i>=0; i--)
		{
			System.out.println(csk.get(i));
		}
	}
}
