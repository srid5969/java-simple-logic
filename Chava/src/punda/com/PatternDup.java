package punda.com;

public class PatternDup {
public static void main(String[] args) {
	int i,j,row=5;
	for(i=0;i<=row;i++) {
		//rows
		for(j=0;j<=i;j++) {
			System.out.print("x ");
		}
		System.out.println();
	}
}
}
