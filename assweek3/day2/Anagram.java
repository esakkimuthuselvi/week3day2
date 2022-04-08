package assweek3.day2;
import java.util.Arrays;

public class Anagram {
	
	public static void main(String []args) {
		String text1 = "stops";
		String text2 = "potss"; 
		int text1length=text1.length();
		int text2length=text2.length();
		boolean status=true;
		
		if(text1length!=text2length) {
			status=false;
		}
		else {
			char[] Arrs1=text1.toCharArray();
			char[] Arrs2=text2.toCharArray();
			Arrays.sort(Arrs1);
			Arrays.sort(Arrs2);
			status=Arrays.equals(Arrs1, Arrs2);
		}
		if(status) {
			System.out.println(text1 + " and " + text2 + " are anagrams");  
		}
		else {
			System.out.println(text1 + " and " + text2 + " are not anagrams");  
		}
		


		
	}

}
