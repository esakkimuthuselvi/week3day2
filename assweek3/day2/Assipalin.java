package assweek3.day2;

public class Assipalin {
	

		
		public static void main(String[] args)
		{
			String ord = "selvi";
			String rev="";
			int ordlength=ord.length();
			
			for(int i=(ordlength-1); i>=0; --i) {
				
				rev=rev+ord.charAt(i);
				System.out.println(rev);
			}
			if(ord.equals(rev)) {
				System.out.println(rev + " is a Palindrome");
			}
			else {
				System.out.println(rev + " is not a Palindrome");
			}
			
			
		}
}

	
