/**
 * 
 */
package org.aks.ctrls;

import java.util.List;

import org.aks.models.Customer;
import org.aks.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akshay
 *
 */
 
@RestController
@RequestMapping(value="/customer")
public class CustomerController  {
	
	@Autowired
	CustomerRepo customerRepo;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Customer> getCustomers(){
		return customerRepo.findAll();
	}
}
