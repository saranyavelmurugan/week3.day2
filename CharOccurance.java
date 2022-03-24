package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
			CharOccurance objcharoccr = new CharOccurance();
			objcharoccr.charOccur();
			
		}
		private void charOccur() {
			String str = "welcome to chennai";
			int count = 0;
			char  passchar ='a';
			char[] strarry = str.toCharArray();
			int stlenth = strarry.length;
			for(int i = 0; i<stlenth;i++) {
				if(strarry[i]== passchar) {
					count++;
				}
			}
			System.out.println("Check number of occurrences of a char : "+ count);

		}

	}
