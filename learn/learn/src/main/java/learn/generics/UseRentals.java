package learn.generics;

import java.util.ArrayList;
import java.util.List;

public class UseRentals {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		Car car = new Car();
		car.setBrand("BMW");
		car.setModel("X5");
		car.setNumber("1111");
		cars.add(car);
		
		car= new Car();
		car.setBrand("Mercedez");
		car.setModel("GL350");
		car.setNumber("2222");
		cars.add(car);
		
		Rental<Car> carRental = new Rental<>(2, cars);
		System.out.println("carRental : "+carRental );
		Car rentalCar = carRental.getRental();
		System.out.println("rentalCar  : "+rentalCar );
		System.out.println("carRental : "+carRental );
		
		car= new Car();
		car.setBrand("Audi");
		car.setModel("A8");
		car.setNumber("3333");
		carRental.returnRental(car);
		System.out.println("carRental : "+carRental );
		
		
		Car rentalCar2 = carRental.getRental();
		System.out.println("rentalCar2 : "+rentalCar2);
		System.out.println("carRental : "+carRental );
		
	}

}
