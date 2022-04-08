package assweek3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Set<Integer> setArr=new TreeSet<Integer>();
		setArr.add(1);
		setArr.add(2);
		setArr.add(3);
		setArr.add(4);
		setArr.add(7);
		setArr.add(6);
		setArr.add(8);
		List<Integer> listArr=new ArrayList<Integer>();
		listArr.addAll(setArr);
		Collections.sort(listArr);
		for (int i = 1; i <= listArr.size(); i++) {
			if (listArr.get(i - 1) == i) {
				continue;
			} else {
				System.out.println("The Missing Element is " + i);
				break;
			}
		}
        //System.out.println(listArr);
		
	}

}
