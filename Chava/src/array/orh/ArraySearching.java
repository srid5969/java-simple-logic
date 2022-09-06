package array.orh;

public class ArraySearching {
	public int findelement(int[] array,int value) {
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==value) {
				
				return array[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] ar= {21,46,87,27,98,13,54};
		int key=87;
		ArraySearching read =new ArraySearching();
		System.out.println(read.findelement(ar, key));
		
		
	}

}
