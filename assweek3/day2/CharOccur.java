package assweek3.day2;

public class CharOccur {
	
	public static void main(String[] args) {
		String str = "welcome to chennai";
		Character  occchar='e';
		
		int noOfOccurance=0;
		char[] Arr1=str.toCharArray();
		int Arr1length=Arr1.length;
		for(int i=0;i<Arr1length;i++) {
			if(str.charAt(i)==occchar) {
				noOfOccurance++;
			}
		}
		System.out.println("Total number of occurence of char "  + occchar +" is : " + noOfOccurance );
	}

}
