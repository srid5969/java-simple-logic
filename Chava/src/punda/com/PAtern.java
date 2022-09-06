package punda.com;

import java.util.Scanner;

public class PAtern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rows = sc.nextInt();
	for(int i=0;i<=rows;i++)
	{

		for (int j = rows - i; j >= 0; j--) { //For Loop for Row

			System.out.print(" "); // Print Spaces

			}
		for(int k=0;k<=i;k++)
		{
			
			System.out.print("*");
			
		}
	System.out.println();
	
	}
		
	
}
}