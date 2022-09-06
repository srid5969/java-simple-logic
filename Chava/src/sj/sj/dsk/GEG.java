package sj.sj.dsk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GEG {


	public static String reverse(String str) {
		// base case: if the string is null or empty
		if (str == null || str.equals("")) {
			return str;
		}

		// create an empty list of characters
		List<Character> list = new ArrayList<Character>();

		// push every character of the given string into it
		for (char c : str.toCharArray()) {
			list.add(c);
		}

		// reverse list using `java.util.Collections` `reverse()`
		Collections.reverse(list);

		// convert `ArrayList` into string using `StringBuilder` and return it
		StringBuilder builder = new StringBuilder(list.size());
		for (Character c : list) {
			builder.append(c);
		}

		return builder.toString();
	}

	public static void main(String[] args) {
		String str = "Techie Delight";

		// String is immutable
		str = reverse(str);

		System.out.println("The reverse of the given string is: " + str);
	}


}
