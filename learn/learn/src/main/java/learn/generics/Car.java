package learn.generics;

public class Car {
	String number;
	String model;
	String brand;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		builder.append("Model : "+getModel());
		builder.append(",");
		builder.append("Brand : "+getBrand());
		builder.append(",");
		builder.append("Number : "+getNumber());
		builder.append("}");
		return builder.toString();
	}
}
