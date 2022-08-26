package org.ht.vdnamma;

public class JokerFundai {
	private void pattern_simplee() {


		int i, j, row = 5;
		for (i = 0; i <= row; i++) {
			// outer loop
			for (j = row - i; j > 0; j--) {
				System.out.print("m");
			}
			System.out.println();
		}

	}

	private void pattern_upsideDown() {
		int i, j, row = 5;
		for (i = 0; i <= row; i++) {
				//outerr loop
			for(j=0;j<=i;j++) {
				System.out.print("x ");
			}
			System.out.println();
		}
	}
private void another_duMmy() {
int i,j,row=5;
for(i=0;i<=row;i++) {
	//outer loop
	for(j=0;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.println();
}
}
private void another_dup() {
int i,j,row=5;
for (i=0;i<=row;i++) {
	//outerr loop
	for(j=0;j<=i;j++) {
		System.out.print("@");
	}
	System.out.println();
}
}
private void another_k() {
int i,j,row=5;
for(i=0;i<row;i++) {
	//outer lop
	for(j=i;j>=0;j--) {
		System.out.print("*");
	}
	System.out.println();
}
}







public static void main(String[] args) {
		JokerFundai mem = new JokerFundai();
		mem.pattern_simplee();
		mem.pattern_upsideDown();
		mem.another_duMmy();
		mem.another_dup();
		mem.another_k();
	}
}
