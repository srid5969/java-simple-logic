package prime.nim.test;

import java.util.Scanner;

public class Public_prime {
	public static void memoeerry
	private void forloop() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			
				if (n % i == 0) {
					count = 1;
				}

			}

			if (count == 0) {
				System.out.println("Its a prime");
				System.out.println("");
			} else {
				System.out.println("Its not a prime");
			}

		}

	

	private void notesloop() {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		n = input.nextInt();
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count = 1;
			}
		}
		if (count == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

	public static void main(String[] args) {
		Public_prime read = new Public_prime();
		read.notesloop();
		read.forloop();
		read.forloop();
		read.forloop();
		read.forloop();
		read.forloop();
		read.forloop();
		read.forloop();
		read.forloop();

	}
}
