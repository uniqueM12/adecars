/**
 * 
 */
package com.adecars.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adecars.models.Car;

/**
 * This Class is used to access the car database.
 * 
 * Since 23:10:18 | 10 Sep 2017
 *
 * @author uniqueM
 */

public interface CarRepository extends MongoRepository<Car, String> {

}
