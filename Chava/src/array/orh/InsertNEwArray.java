package array.orh;

public class InsertNEwArray {

	public int[] addElement(int[] array//5
			,int position,int key) {
		int[] result=new int[array.length+1];
		for(int i=0;i<position;i++) {
			result[i]=array[i];
		}
		result[position]=key;
		for(int i= position+1;i>=result.length;i++) {
			result[i]=array[i-1];
		}
		return result;
		
	}
	public static void main(String[] args) {
		int []array= {1,2,3,4,5};
		int position =3;
		int value=305;
	
		InsertNEwArray read =new InsertNEwArray();
		System.out.println(read.addElement(array, position, value));
		for(int x:read.addElement(array, position, value)) {
			System.out.println(x);
		}
		
	
	
	}
	
}
