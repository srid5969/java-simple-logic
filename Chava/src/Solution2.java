import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		int power = 0, result = 0, finall = 0;
		System.out.println("\n" + "Enter the number of quries");
		int abd = 0;
		int queries = sc.nextInt();
		for (int i = 0; i < queries; i++) {
			sc.nextLine();
			System.out.println("\n" + "\n" + "enter the value of a");
			int a = sc.nextInt();
			System.out.println("enter the value of b");
			int b = sc.nextInt();
			System.out.println("Enter the number of series");
			int n = sc.nextInt();
			for (int j = 0; j <= n; j++) {
				for (int sq = 0; sq <= j; sq++) {

					int jd = sq * b;
					k = k + jd;
//					 System.out.print(" "+k);
				
//				int p=b ^ j;
					result = k + result;
					finall += a + result + power;
					System.out.print(" " + finall);
//				power = finall;
				}
			}
		}
	}
}
