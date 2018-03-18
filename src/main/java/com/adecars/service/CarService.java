/**
 * 
 */
package com.adecars.service;

import java.io.IOException;
import java.util.List;

import com.adecars.models.Car;
import com.adecars.models.Make;

/**
 * Since 01:04:16 | 11 Sep 2017
 *
 * @author uniqueM
 */

public interface CarService {

	void save(Car car) throws IOException;

	Make findOne(String id);

	List<Car> findAll();
}
