import java.util.Scanner;

public class JokeyThUYOLI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[3];
		int[] a = new int[3];
		int i = 0;
		while (i <= 2) {
			s[i] = sc.nextLine();
			a[i] = sc.nextInt();
			sc.nextLine();
			i++;
		}
		for (int e = 0; s[i].length() < 15; e++) {
			s[i] = s[i] + " ";
		}
		System.out.println();
		System.out.println("================================");
		for (i = 0; i < 3; i++) {
			System.out.print(s[i]);
			System.out.print(a[i]);
			System.out.println();
		}
		System.out.println("================================");
	}
}