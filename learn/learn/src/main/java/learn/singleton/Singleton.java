package learn.singleton;

import java.util.HashSet;
import java.util.Set;

public class Singleton {

	private static Singleton INSTANCE;
	private Set<String> availableSeats = new HashSet<String>();
	private Singleton(){
		availableSeats.add("A1");
		availableSeats.add("A2");
		
		availableSeats.add("B1");
		availableSeats.add("B2");
	}
	//Double checked lock pattern
	public static Singleton getInstance(){
		if(INSTANCE==null){						//first lock
			synchronized (Singleton.class) {			//second lock
				INSTANCE = new  Singleton();	
			}
		}
		return INSTANCE;
	}
	
	public boolean bookTicket(String name){
		return availableSeats.remove(name);
	}
}
