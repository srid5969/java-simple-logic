package array.orh;

import java.util.Arrays;

public class ToDeleteAelement {
           public int[] deleteAray(int[] array, int value) {
        	   		int[] result=new int[array.length-1];
        	   for(int i=0,k=0;i<array.length;i++)
        	   {
        		   if(array[i]==value)
        		   {
        			   continue;
        		   }
        		   result[k++]=array[i];
        		   
        	   }
        	   return result;
        	   
		}
           public static void main(String[] args) {
			int[] ar= {344,67,2,8,109,3,12,67};
			int key=109;
			System.out.println(Arrays.toString(ar));
			System.out.println();
			ToDeleteAelement read =new ToDeleteAelement();
			System.out.println(Arrays.toString(read.deleteAray(ar, key)));
			ar=read.deleteAray(ar, key);
			System.out.println(Arrays.toString(ar));
		}
}
