/**
 * 
 */
package org.aks.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author akshay
 *
 */
@org.springframework.stereotype.Repository
public class MongoRepository<T> implements Repository<T> {

	@Autowired
	MongoTemplate template;

	  public List<T> getAll(Class<T> clazz ){
		return template.findAll(clazz);
	}

	public T get(T t) {
		//TODO 
		return null;
	}

	public boolean update(T t) {
		//TODO 
		return false;
	}

	public boolean delete(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean insert(T t) {
		// TODO Auto-generated method stub
		return false;
	}
}
