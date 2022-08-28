import java.util.*;
public class Problem {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String  ......");
	String stringValue = s.nextLine();
	//string value
	System.out.println("enter the number in multiple of 6");
	int n=s.nextInt();  
	//n value
	for(int i=stringValue.length();i<=n;i++)
	{  
		stringValue=stringValue+"*";
	}
	if(n==6)
	{  
		for(int i=1;i<=2;i++)
		{//2 space
			System.out.print(" ");
		}
	}  
	else
	{

		for(int i=1;i<=3;i++)
		{
			//3 space
			System.out.print(" ");
		}
	}
	  
	 int j=1;
	while(j<=n-3)
	{
		if(j==1)
		{
			System.out.print(stringValue.charAt(j-1)); 
			j++;
		}  
		else if(j>3)
		{  
			System.out.print(stringValue.charAt(j-1));     
			j=j+1;
			for(int l=1;l<=5;l++) 
			{
				System.out.print(" ");
			}  
			System.out.print(stringValue.charAt(j-1)); 
			j=j+1;
		}
		
		else {   
			System.out.print(" ");
			System.out.print(stringValue.charAt(j-1));  
			j++;
			for(int l=1;l<=3;l++) 
			{
				System.out.print(" ");
			}
				
			
			System.out.print(stringValue.charAt(j-1));   
			j=j+1;
		
		}    
		
	
		System.out.println();
		
}    
	while(j<=n)
	{
		  
		if(j==n)
		{  
			for(int i=1;i<=3;i++)
			{
				System.out.print(" ");
			} 
			System.out.print(stringValue.charAt(j-1));
			return;
		}  
		System.out.print(" ");
		System.out.print(stringValue.charAt(j-1));    
		j++;
		for(int i=1;i<=3;i++)
		{
			System.out.print(" ");
		}  
		System.out.print(stringValue.charAt(j-1));
		j++; 
		System.out.println();
		
		
	}
	
	
}
}
