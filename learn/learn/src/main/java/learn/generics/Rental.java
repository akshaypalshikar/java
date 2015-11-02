package learn.generics;

import java.util.List;

public class Rental<T> {

	private List<T> rentals ;
	private final int max;
	private int available;
	
	public Rental(int max, List<T> rentals){
		this.max=max;
		this.rentals=rentals;
		this.available=this.max;
	}
	
	public T getRental(){
		T rental = rentals.remove(max-available);
		available--;
		return rental;
	}
	
	public void returnRental(T returnedThing){
		rentals.add(returnedThing);
		available++;
	}
	
	private List<T> getRentals() {
		return rentals;
	}

	private void setRentals(List<T> rentals) {
		this.rentals = rentals;
	}

	private int getAvailable() {
		return available;
	}

	private void setAvailable(int available) {
		this.available = available;
	}

	private int getMax() {
		return max;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("{");
		stringBuilder.append("Rentals : "+getRentals());
		stringBuilder.append(",");
		stringBuilder.append("available : "+getAvailable());
		stringBuilder.append(",");
		stringBuilder.append("Total : "+getMax());
		stringBuilder.append("}");
		return stringBuilder.toString();
	}
}

