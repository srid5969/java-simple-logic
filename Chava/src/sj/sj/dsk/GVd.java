package sj.sj.dsk;

import java.util.Scanner;

public class GVd {
	public static String reverse(String input) {
		StringBuffer out = new StringBuffer();
		char ca[] = input.toCharArray();
		for (int i = ca.length - 1; i >= 0; i--) {
			out.append(ca[i]);
		}
		return out.toString();

	}

	public static void main(String[] args) {
		StringBuffer input = new StringBuffer();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String str = new String();

		
		System.out.println(str);
		for (int outerloop = 0; outerloop <= s.length(); outerloop++) {
			
		if (s.charAt(outerloop)==' ') {
			break;
		}
		str.
		}
	}

}
