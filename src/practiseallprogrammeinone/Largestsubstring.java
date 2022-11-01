package practiseallprogrammeinone;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Largestsubstring {

	public static void main(String[] args) {
		String s = "aabddsgh";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}

		}
		
		String string = map.keySet().toString();
		System.out.println(string);
		

	}

}
