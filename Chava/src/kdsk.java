
public class kdsk {
public static void main(String[] args) {
	String str = "abc abc1 abc2 abc3 abc4";
	char[] arr = { 'p', 'q', 'r', 's' };
	 String st=" ";
      String str1 = String.valueOf(arr);
      System.out.println(str);
      for(int i=0;i<=str.length();i++) {
    	st=st.concat(String.valueOf(arr[i]));
      }
      System.out.println(st);
}
}
