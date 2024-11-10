package Collection;

import java.util.ArrayList;

public class C6 {

	public static void main(String [] args)
	{
		ArrayList a = new ArrayList();
		System.out.println(a);
		for(char c='a'; c<='z'; c++)
		{
			a.add(c);
		}
		
		System.out.println("List:" + a);
		
		for(int i=(a.size()-1); i>=0; i--)
		{
			System.out.println(a.get(i));
		}
	}
}
