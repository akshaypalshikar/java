/**
 * 
 */
package org.aks.ctrls;

import java.util.List;

import org.aks.models.Customer;
import org.aks.repos.MongoRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akshay
 *
 */
 
@RestController
public class CustomerController  {
	
	Logger logger = Logger.getLogger(CustomerController.class) ;
	
	@Autowired
	MongoRepository<Customer> customerRepo;
	
	@RequestMapping(value="/customer",method=RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE})
	
	public List<Customer> getCustomers(){
		List<Customer> customers = customerRepo.getAll(Customer.class);
		customers.forEach(customer->logger.info(customer.toString()));
		return customers;
	}
}
