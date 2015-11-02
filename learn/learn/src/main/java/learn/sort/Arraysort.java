package learn.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Arraysort {

	public static void main(String[] args) {
		String strArray [] = {	"One",
								"Two",
								"Three",
								"Four",
								"Five"
							};
		
		System.out.println("Natural sort:");
		Arrays.sort(strArray);
		for(String str : strArray){
			System.out.println(str);
		}

		System.out.println("\n\nReverse sort:");
		
		ReSortComparator comparator = new ReSortComparator();
		Arrays.sort(strArray,comparator);
		for(String str : strArray){
			System.out.println(str);
		}
		
	}

	static class ReSortComparator implements Comparator<String>{

		public int compare(String str1, String str2) {
			return str2.compareTo(str1);
		}
		
	}
	
}
