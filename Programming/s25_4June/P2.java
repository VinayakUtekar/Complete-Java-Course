package s25_4June;

/* WJP to get the following output
   input - meet me at the clock tower
   output - m%%t #e AT th& ##o## TOWER
   
   String = ..1.. ..2.. ..3.. ..4.. ..5.. ..6..
   
   1 -> all the vowels in string 1 must be replaced with %
   2 -> all the consonant in string 2 must be replaced with #
   3 -> all the character in string 3 must be in upper case
 */

public class P2 {
	public static String vowel(String s) {
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ||
			   ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') {
				ch[i] = '%';
			}
		}
		return new String(ch);
	}
	
	public static String consonant(String s) {
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if( (ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z') ) {
				if(!(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ||
				   ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') ){
					ch[i] = '#';
				}
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Meet me at the clock tower";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			if(i%3 == 0) {
				System.out.print(vowel(a[i]) + " ");
			}else if(i%3==1) {
				System.out.print(consonant(a[i]) + " ");
			}else if(i%3==2) {
				System.out.print(a[i].toUpperCase() + " ");
			}
		}
		
	}

}
