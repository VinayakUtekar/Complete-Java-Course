package s19_27May;

/*
  String Class Only****** (String Buffer, String Builder are different)
  
  String - Group of characters
  Properties - Immutable, Final CLass
  Stored in - java.lang
  Inherits - Three Interface
  	1) CharSequence - To maintain the sequence of the character in the string
  	2) Comparable - to compare to string
  	3) Serializable - to provide serialization i.e to convert data from object to bytecode
  	
  How to create a String Object?
  1) Using String Literal
  	 String var = String Literal;
  	 eg - String s = "Burger";
  	 
  2) Using New Keyword
  	 String var = new String(String Literal);
  	 eg - String s = new String("pizza");
   	 
  	 
  Heap Area -> String Constant Pool(SCP)
	  String Constant Pool - Storage to store new string literal object
	  String is never stored in heap area instead it is stored in SCP
	  Used to avoid duplication of data -> if the data is same it wil use old object address instead of creating new
	  
 1) String Created Using String Literal
    If we create a string object sing string literal then the object is created in the string constant pool where if the object already exists it 
    returns the address of the same object
	  Object Creation -> 
		  String literal used for initializing -> Data provided -> JVM checks for data present in SCP
		  if data is not present it will create new object and store the data and wil send the address
		  if already data present then it will not create new object instead it ill share the address of existing object
	  Problem ->
	  	As all members share same object address if one changes data in object it changes data for all having the address
	  Solution ->
	  	Immutable - No changes allowed in existing data...instead create new

	
  2) String Created Using New Keyword
  	 If we create a object using new keyword object is created in the heap area and address is returned...
  	 Along with that one more object will be created in the string constant pool where address will be returned to the JVM
	  Object Creation -> 
		  New Keyword used for initializing -> Data provided -> JVM creates new object in heap area
		  As it has double qoutes data it defines string hence also creates the object in SCP....	
		  For SCP it Follows same conditions	  
  
*/

/* Serialization - To convert data from database stored in object format to text format in textfile... we need to
  					convert the object to byte code which is done by serialization

	Margel Interface - Empty class.... only accessable to 
 */

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Burger";
		String s2 = "Burger";
		System.out.println(s1 == s2);
		
		String s4 = new String("Pizza");
		String s5 = new String("Pizza");
		System.out.println(s4 == s5);
		
	}

}
