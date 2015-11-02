/**
 * 
 */
package learn.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author akshay
 *
 */
public class ArrayListSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strArray [] = {	"One",
				"Two",
				"Three",
				"Four",
				"Five"
			};
		
		List<String> list = Arrays.asList(strArray);
		
		
		
		System.out.println("Natural order sorting : ");
		Collections.sort(list);
		printList(list);
		
		System.out.println("\n\nReverse sorting : ");
		ReverseOrderComparator comparator = new ReverseOrderComparator();
		Collections.sort(list,comparator);
		printList(list);

	}

	static class ReverseOrderComparator implements Comparator<String>{
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
	}
	
	 public static  <T> void printList(List<T> list){
		for(T t:list){
			System.out.println(t);
		}
	}
	
}
