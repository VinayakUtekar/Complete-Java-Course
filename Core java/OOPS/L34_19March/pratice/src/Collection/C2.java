package Collection;

import java.util.ArrayList;

public class C2 {

	public static void main(String [] args)
	{
		ArrayList a = new ArrayList();
		System.out.println(a);
		for(char c='A'; c<='Z'; c++)
		{
			a.add(c);
		}
		System.out.println("List : " + a);
		System.out.println("No of Obects : " + a.size());
	}
}
