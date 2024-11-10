package s23_31May;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*
 Use of inner interface
 interface map{interface entry{ get key(), get value()}}
 */

public class P4 {

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
		for(Entry<Character,Integer> e: map.entrySet()) {
			index++;
			if(e.getValue() == 1)
			{
				break;
			}
		}
		if(index <= map.size()) {
			System.out.println(index);
		}else {
			System.out.println(-1);
		}
		
	}

}
