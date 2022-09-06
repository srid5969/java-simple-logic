import java.util.Scanner;

public class Fuvdf {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int quries = sc.nextInt();
	for(int q=0;q<quries;q++)
	{
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int[] result=new int[n];
		for(int i=0,k=1,e=a+b*k;i<n;i++,k=k*2,e=e+b*k) {
			result[i]=e;
		}
		for(int x:result)
		{
			System.out.print(x+" ");
		}
	}
}
}

