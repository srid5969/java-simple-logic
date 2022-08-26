package org.ht.vd;

public class JHa_ked {
	public static void main(String[] args) {
		JHa_ked read = new JHa_ked();
		read.decreament(10);
		read.increament(10);
		read.decreament(10);
		read.increament(10);
	}

	private void decreament(int a) {

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("x");
			}
			System.out.println();

		}
	}

	private void increament(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = a; j >= i; j--) {
				System.out.print("x");
			}
			System.out.println();
		}
	}

}