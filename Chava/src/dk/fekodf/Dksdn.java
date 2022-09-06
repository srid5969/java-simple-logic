package dk.fekodf;
import java.util.*;
public class Dksdn {
	public static void reverse (String input)
	{
		for(int i=input.length()-1;i>=0;i--)
		{
			System.out.print(input.charAt(i));
		}  
		System.out.print(" ");
		
		
	}
public static void main(String[] args) {
	String s="My name is sreedhar";  
	ArrayList<String> al=new ArrayList<String>();
	String str="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==' ')
		{ 
			al.add(str);  
			str="";
			
			
		}   
		else if(i==s.length()-1)
		{
			str=str+s.charAt(i);
			al.add(str); 
			
		}
		else
		{
			str=str+s.charAt(i);
		}
	}
	
	//System.out.println(al);
	for(int i=0;i<al.size();i++)
	{
		//System.out.println(al.get(i));  
		reverse(al.get(i));
	}
}
}
