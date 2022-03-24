package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String strvar = "chennai";
		int strlnt = strvar.length();
		String rev="";
		System.out.println("strvar: "+strvar);

		for(int i = strlnt-1;i>=0;i--) {
			rev=Character.toString(strvar.charAt(i));
			//char[] concstr = strvar.toCharArray();
			System.out.println(rev);
			
		}
		if(strvar.equals(rev)) {
			System.out.println("P");
		}
		else {
			System.out.println("NP");
		}
	}

}