package djn.jsd;

import java.util.Scanner;

public class JDld {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rows num");
//	int rows = sc.nextInt();
	int rows=5;
	for(int i=0;i<=rows;i++) {
		//outer loop
		for(int j=0;j<=i;j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
}
}
