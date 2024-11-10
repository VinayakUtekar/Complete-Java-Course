package s27_6June;

/*

-> Compareto()
	 Compareto as =/>/</! does not know how to compare hence we use Comparaable interface that has compareto() method
	 01 > 02 -> +ve result
	 01 < 02 -> +ve result
	 01 = 02 -> 0
	 
	 s1 = Apple
	 s2 = Hi
	 compare to will compare string.char at[0]
	 s1[A] compare to s2[H] = 95-104 gives diference of ascii value of charater and produces output
	 result -> -9 representing A is less then H
	 
	 s1 = hi
	 s2 = hello
	 s1[h] compare to s2[h]  -> 0
	 s1[i] compare to s2[e]  -> 105 - 101 -> 4 +ve
	 
	 s1 = hello
	 s2 = he
	 s1[h] compare to s2[h]  -> 0
	 s1[e] compare to s2[e]  -> 0
	 s1.length compare to s2.length -> the one with greater length is after the smaller one
	 
	 Drawback of Compareto -> case sensitive that is if capital compare to lower it gives problem 
	 lexographically -> alphabetically comparison
*/


public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a = {"coofee", "Watermelon", "apple", "orange", "grape"};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j].compareToIgnoreCase(a[j+1])>0) {
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}