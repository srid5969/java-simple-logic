package prime.nim.test;

import java.util.Scanner;

public class HRLoops2_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int  f = 0, d = 2;
		
		int q = sc.nextInt();
		for (int i = 1; i <= q; i++) {//outer loop

			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			f = a + b;

			System.out.print(f + " ");

			for (int j = 1; j <= (c - 1); j++) {

				for (int k = 1; k < j; k++) {

					d *= 2;

				}

				f += d * b;

				d = 2;

				System.out.print(f + " ");

			}
			System.out.println("");
		}
	}
}
