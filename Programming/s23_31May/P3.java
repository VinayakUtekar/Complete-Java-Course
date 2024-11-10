package s23_31May;

import java.util.Collection;
import java.util.LinkedHashMap;

// WJP to find a unique character is one that appears only once in a string

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "statistics";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count + 1);
			}
			else {
				map.put(ch, 1);
			}
		}
		int index = 0;
		boolean isUnique = false;
		Collection<Integer> c = map.values();
		for(Integer i : c) {
			index++;
			if(i == 1 ) {
				isUnique = true;
				break;
			}
		}
		if(isUnique) {
			System.out.println(index);
		}
		else {
			System.out.println(-1);
		}
	}

}
