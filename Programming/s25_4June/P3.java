package s25_4June;

// WJP to convert Roman number to Integer

import java.util.*;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "LIX";
		s = s.replace("IV", "IIII");//4
		s = s.replace("IX", "VIIII");//9
		s = s.replace("XL", "XXXX");//40
		s = s.replace("XC", "LXXXX");//90
		s = s.replace("CD", "CCCC");//400
		s = s.replace("CM", "DCCCC");//900
		
		Map<Character, Integer> roman = new HashMap<>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum = sum + roman.get(s.charAt(i));
		}
		System.out.println(sum);
	}
}
