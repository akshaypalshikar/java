package org.aks.models;

import java.util.function.Consumer;

import org.springframework.data.annotation.Id;


public class Customer implements Consumer<Customer> {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

	@Override
	public void accept(Customer t) {
		System.out.println(t.toString());
	}

}

