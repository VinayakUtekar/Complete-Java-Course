package s27_6June;

import java.util.Stack;

/*
 WJP to check for balance parantethis
 
 {[{}]}  ->  balance
 }[]{}	 ->  uunbalance
 ([)}	 ->  unbalance
 
 LIFO -> Last In First Out
*/

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{[{}]}";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
				continue;
			}else if(stack.isEmpty()) {
				System.out.println("Unbalance");
				return;
			}
			char pop = stack.pop();
			switch(pop) {
			case '(' : if(s.charAt(i) == ']' || s.charAt(i) == '}') {
						System.out.println("Unbalance");
						return;
					   }
					   break;
			case '[' : if(s.charAt(i) == ')' || s.charAt(i) == '}') {
				System.out.println("Unbalance");
				return;
			   }
			   break;
			   
			case '{' : if(s.charAt(i) == ')' || s.charAt(i) == ']') {
				System.out.println("Unbalance");
				return;
			   }
			   break;
			}
		}
		if(stack.empty()) {
			System.out.println("Balanced");
		}else {
			System.out.println("Unbalanced");
		}
	}

}
