package s28_June;

/*
	append(string s) -> it is used to append the specific string with this string. the append() method is overloaded like append(char), 
						append(boolean), append(int), append(float), append(double) etc.
	
	insert(int offset, String s) -> it is used to insert the specified string with this string at the specified position.the insert() method 
									is overloaded like insert(int, char), insert(int,boolean), insert(int,int), insert(int,float), 
									insert(int,double), etc
	
	replace(int startIndex,int endIndex, String str) -> it is used to replace the string from specified startIndex and endIndex 
	
	delete(int stratIndex, int endIndex) -> it is used to delete the string from specified startIndex and endIndex
	
	reverse() -> it is used to reverse the string
*/

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Python");
		System.out.println(sb);
		sb.append("Language");
		System.out.println(sb);
		sb.insert(6, " Programming Language");
		System.out.println(sb);
		sb.delete(19, 28);
		System.out.println(sb);
		sb.replace(0, 6, "java");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
