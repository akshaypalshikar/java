/**
 * 
 */
package org.aks.repos;

import java.util.List;

/**
 * @author akshay
 *
 */
public interface Repository<T> {

	 public List<T> getAll(Class<T> clazz);
	 public T get(T t);
	 public boolean update(T t);
	 public boolean delete(T t);
	 public boolean insert(T t);
}
