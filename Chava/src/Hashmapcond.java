import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class Hashmapcond {
	public static void main(String args[]) {
		System.out.println(" `enter the string");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}}
		System.out.println(hm);
		Set<Character> keys = hm.keySet();
		for (Character i : keys) {
			String d = "" + i;
			System.out.print(d + hm.get(i));
		}}}