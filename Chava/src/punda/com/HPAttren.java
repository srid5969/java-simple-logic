package punda.com;

public class HPAttren {
	public static void main(String[] args) {
		int rows=5;
		for(int i=0;i<=rows;i++)
		{
			for(int j=3*(rows-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" x ");
			}
			System.out.println("\n");
		}
	}

}
