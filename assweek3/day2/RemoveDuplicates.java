package assweek3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		Set<String> wordSet = new LinkedHashSet<String>(); 
		String result =" ";
		for(String str: words)
		{
			wordSet.add(str);
			
		}
		
		List<String> list = new ArrayList<String>();
		list.addAll(wordSet);
		
			
		for(int i=0; i<list.size(); i++)
		{
			result = result + list.get(i)+" ";
					}
		System.out.println(result);

	}

}
