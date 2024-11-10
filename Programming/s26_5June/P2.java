package s26_5June;

//JP to find occurance of substring

public class P2 {

	public static int countHi(String s) {
		if(s.indexOf("hi") != -1) {   //can also use s.contains("hi")
			return 1+countHi(s.substring(s.indexOf("hi")+2));  //+2 define length of substring to add in index to get next substring
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xxhixxhixxxxhixxhixhi";		//xxhixxhixxxxhixxhixhixx method one gives issue
		
		//Method 1 but issue
		String [] a = s.split("hi");
		System.out.println(a.length);
		
		//Method 2 GPT
		int count = s.split("hi", -1).length-1;
		System.out.println(count);
		
		//Method 3
		System.out.println(countHi(s));
	}

}
