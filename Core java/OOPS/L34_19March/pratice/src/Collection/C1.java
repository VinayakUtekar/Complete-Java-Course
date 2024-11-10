package Collection;

import java.util.ArrayList;

public class C1 {

	public static void main(String [] args)
	{
		ArrayList a = new ArrayList();
		System.out.println(a);
		a.add(10);
		a.add(15.5);
		a.add('c');
		a.add("Sheela");
		a.add(null);
		a.add(10);
		a.add(null);
		a.add("Sheela");
		a.add(true);
		System.out.println("List : " + a);
		System.out.println("No of Obects : " + a.size());
	}
}
