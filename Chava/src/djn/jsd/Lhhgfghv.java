package djn.jsd;

import java.util.Scanner;

public class Lhhgfghv {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n" + "Enter the number of quries");
		int queries = sc.nextInt();
		for (int k1 = 0; k1 < queries; k1++) {
			sc.nextLine();
			System.out.println("\n" + "\n" + "enter the value of a");
			int a = sc.nextInt();
			System.out.println("enter the value of b");
			int b = sc.nextInt();
			System.out.println("Enter the number of series");
			int n = sc.nextInt();
			int[] result = new int[n];
			for (int i = 0, k = 1, e = a + k * b; i < n; ++i, k *= 2, e += k * b) {
				result[i] = e;
			}
			for(int x:result)
			{
				
				System.out.print(x+" ");
			}
		}
	}
}
