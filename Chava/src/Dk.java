import java.util.Scanner;
//swapping the string
public class Dk {
	public static String reverse(String iny) {
		StringBuilder b = new StringBuilder();
		char[] a = iny.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
			b.append(a[i]);
		}
		return b.toString();
		
	}
public static void main(String[] args) {
	System.out.println("Ener the String ...");
	String s = new Scanner(System.in).nextLine();
	System.out.println(reverse(s));
}

}
