package punda.com;

public class PatternP1 {
	public static void main(String[] args) 
	{                 
		int n = 5;                   
		for (int i = 0; i < n; i++) 
		{
			// outer loop
			for (int j = n - i; j > 1; j--) 
			{                                          
				System.out.print(" ");
				// to space                
				for (int k = 0; k < i; k++) 
				{                           
					System.out.print("x ");
					// pattern                              
				}                            
				System.out.println();          
			}                                     
		}                                    
	}                                     

}