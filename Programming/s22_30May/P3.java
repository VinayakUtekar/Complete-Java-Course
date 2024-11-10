package s22_30May;

import java.util.LinkedHashMap;

//WAJP to count the frequency of each character present in the string.

// Itterate over String for each character
// Use LinkedHashMap to sotre and update character with its count on each iteration
// incerement Count i.e value of the Character i.e key at each occurance to get the final count of each uniqure character in string 

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "maharashtra";
		LinkedHashMap<Character, Integer> data = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(data.containsKey(ch)) {
				int count = data.get(ch);
				data.put(ch,count+1);
			}else {
				data.put(ch,1);
			}
		}
		System.out.println(data);
	}

}
