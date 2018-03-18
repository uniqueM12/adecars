/**
 * 
 */
package com.adecars.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adecars.models.Model;

/**
 * Since 04:17:41 | 11 Sep 2017
 *
 * @author uniqueM
 */

public interface ModelRepository extends MongoRepository<Model, String> {

	Model findByModel(String model);
}
