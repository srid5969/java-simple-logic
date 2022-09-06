import java.util.HashMap;
import java.util.Scanner;

public class Haxhmaup {
	public static void main(String[] args) {
		HashMap<Character, Integer> mapi = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String fuckingstring = sc.nextLine();
		for (int i = 0; i < fuckingstring.length(); i++) {
			if (mapi.containsKey(fuckingstring.charAt(i))) {
				// second occurence
				mapi.put(fuckingstring.charAt(i), mapi.get(fuckingstring.charAt(i)) + 1);
			} else {
				// first occurence
				mapi.put(fuckingstring.charAt(i), 1);
			}
		}
		//closing loop
		System.out.print(mapi.toString());
	}
}
