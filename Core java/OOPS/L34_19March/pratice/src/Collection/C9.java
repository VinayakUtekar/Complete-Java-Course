
package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class C9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 1; i <=10;i++) {
			
			System.out.println("String data");
			a.add(s.nextLine());
		}
		a.add(null);
		
		for (int i = 1; i <=6;i++) {
			
			System.out.println("Int data");
			a.add(s.nextInt());
			
		}
		for (int i = 1; i <=5;i++) {
	
			System.out.println("Double data");
			a.add(s.nextDouble());
		}
		System.out.println("List: "+ a);
		System.out.println("Size of list: "+a.size());
		
		System.out.println("Printing data one by one: ");
		
		System.out.println("Reverse order using Get index method: ");
		
		for (int i = a.size()-1;i>=0;i--) {
			System.out.println(a.get(i));
		}
		
		System.out.println("Forward Direction using For each loop");
		for(Object obj : a) {
			System.out.println(obj);
		}
		
		System.out.println("Forward direction using iterator");
		Iterator i = a.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Reverse Order using ListIteratos");
		ListIterator li = a.listIterator(a.size());
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		a.remove(0);
		a.remove(a.size()-1);
		
		System.out.println("After removing last and 1st order: "+a);
		
		if (a.contains(null)==true) {
			System.out.println("Yes,null object exists!");
		}else {
			System.out.println("Oh,null object doesn't exist!");
		}
	}
}