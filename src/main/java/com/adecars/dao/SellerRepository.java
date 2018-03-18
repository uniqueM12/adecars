/**
 * 
 */
package com.adecars.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adecars.models.Seller;

/**
 * Since 00:11:21 | 11 Sep 2017
 *
 * @author uniqueM
 */

public interface SellerRepository extends MongoRepository<Seller, String> {

	Seller findByUserNameIgnoreCase(String username);

	Seller findByEmailIgnoreCase(String email);
}
