package punda.com;

public class JokerPunda2 {
public static void main(String[] args) {
	int row=6;
	for (int i=0;i<row;i++) {
		//outeer lopp
		for(int j=2*(row-i);j>=0;j--) {
			//to print space
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("x ");
		}
		System.out.println();
	}
}
}
