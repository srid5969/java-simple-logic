package dk.fekodf;

import java.util.Scanner;

public class HFdis {
	public static void reverse(String input)
	{
		for(int i=input.length()-1;i>=0;i--) {
			System.out.print(input.charAt(i));
		}
		System.out.print(" ");
	}
	

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string value");
		String s = sc.nextLine();
//		String s="yM eman si rahdeers ";  
		String arr[]=s.split("\\W");
		for(int i=0;i<arr.length;i++)
		{
		reverse(arr[i]);
		}
	}

}
