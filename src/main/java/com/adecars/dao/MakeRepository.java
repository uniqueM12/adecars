/**
 * 
 */
package com.adecars.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adecars.models.Make;

/**
 * Since 00:15:46 | 11 Sep 2017
 *
 * @author uniqueM
 */

public interface MakeRepository extends MongoRepository<Make, String> {

}
