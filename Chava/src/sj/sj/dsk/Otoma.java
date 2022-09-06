package sj.sj.dsk;

import java.util.ArrayList;
import java.util.List;

public class Otoma {
	public static void main(String[] args) {
//		String str = "abc abc1 abc2 abc3 abc4";
		char[] arr = { 'p', 'q', 'r', 's' };
	      String str = String.valueOf(arr);
	      System.out.println(str);
		List<Character> li = new ArrayList<>();
		for (char c : str.toCharArray()) {
			li.add(c);

		}
		for (int j = 0; j <= str.length(); j++) {
			if (str.toCharArray()[j] == ' ') {
				break;
			}
			for (int i = 0; i <= str.length(); i++) {
				if (str.toCharArray()[j] == ' ') {
					break;
				}
				System.out.print(str.charAt(i));


			}

		}
	}
}
