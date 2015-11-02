/**
 * 
 */
package learn.singleton;

/**
 * @author akshay
 *
 */
public class UseSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.bookTicket("A1");
		System.out.println(singleton.bookTicket("A2"));
		
		System.out.println(singleton.bookTicket("A2"));

	}

}
