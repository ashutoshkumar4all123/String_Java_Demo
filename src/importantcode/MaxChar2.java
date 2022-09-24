package importantcode;

import java.util.HashMap;
import java.util.Map;

public class MaxChar2 {

	public static void main(String[] args) {
		String s= "abbcccddpppp";
		HashMap<Character, Integer> hs= new HashMap<>();
		char [] c = s.toCharArray();
		for(char ch : c) {
			if(hs.containsKey(ch)) {
				hs.put(ch, hs.get(ch)+1);
			}else {
				hs.put(ch, 1);
			}
		}
		int maxCount= 0;
		char maxChar= ' ';
		for(Map.Entry<Character, Integer> me: hs.entrySet()) {
			if(maxCount < me.getValue()) {
				maxCount= (int) me.getValue();
				maxChar = (char) me.getKey();
			}
		}
		System.out.println("Maximum occurance charecter is: " + maxChar);

	}

}
