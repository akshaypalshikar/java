/**
 * 
 */
package org.aks.repos;

import org.aks.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author akshay
 *
 */
public interface CustomerRepo extends MongoRepository<Customer, String>{

}
