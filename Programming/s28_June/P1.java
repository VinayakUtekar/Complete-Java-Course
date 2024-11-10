package s28_June;

/*
  String Buffer -> 
  	It is a class present in java.lang package
  	It is used to Create Mutable String object
  	String buffer is similar to string class except objects created are mutable (modifiable)
  	this class is thread safe i.e multiple threads cannot access it simulteanously
*/
/*
  String --> immutable
  StringBuffer --> Mutable
  
  String Buffer -> similar to String
    Present inside Java.lang pacakge
  	Mutable, Synchronous, No String Constant Pool
  	Object stored in heap area only
*/


public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String s = "Qspider";
		  System.out.println(s); //-> Qspider
		  s.concat("Thane");
		  System.out.println(s); // -> QSspider
		  s = s.concat("Thane");
		  System.out.println(s); //-> QSspiderThane
		  
		  StringBuffer sb = new StringBuffer("JSpider");
		  System.out.println(sb);  //-> JSpider
		  sb.append("Thane");
		  System.out.println(sb); //-> JspiderThane
	}

}
