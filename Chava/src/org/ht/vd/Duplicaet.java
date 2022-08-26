package org.ht.vd;

public class Duplicaet {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			
		
			for (int j = 5; j >= i; j--) {
			System.out.print("*");
			}
			System.out.println();
			}
		

		System.out.println();
	}
}
