import java.util.Iterator;

public class Dfance {
	public static void main(String[] args) {
		String str ="123";
		System.out.println(reverse(str));
	}
	public static String reverse(String input) {
		StringBuffer out=new StringBuffer();
		char[] singles = input.toCharArray();
		for(int i=singles.length-1;i>=0;i--) {
			out.append(singles[i]);
		}
		return out.toString();
		
	}

}
