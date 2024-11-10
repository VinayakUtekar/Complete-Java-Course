package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class C8 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		for(int i=1; i<=6; i++)
		{
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			a.add(name);
		}
		System.out.println("Insertion Order: " + a);		
		Collections.sort(a);
		System.out.println("Ascending : " + a);
		Collections.reverse(a);
		System.out.println("Descending : " + a);
		
		Iterator ie = a.iterator();
		System.out.println("Forward : ");
		while(ie.hasNext())
		{
			System.out.println(ie.next());
		}
		
		ListIterator i = a.listIterator(a.size());
		System.out.println("Backward : ");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
	}

}
