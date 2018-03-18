/**
 * 
 */
package com.adecars.service;

import com.adecars.models.Seller;

/**
 * Since 01:06:51 | 11 Sep 2017
 *
 * @author uniqueM
 */

public interface SellerService {

	void save(Seller seller);

	Seller findByUserName(String username);

	Seller findByEmail(String email);

}
