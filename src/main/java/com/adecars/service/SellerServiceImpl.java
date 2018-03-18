/**
 * 
 */
package com.adecars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adecars.dao.SellerRepository;
import com.adecars.models.Seller;

/**
 * Since 02:01:02 | 11 Sep 2017
 *
 * @author uniqueM
 */

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	SellerRepository sellerRepository;
	/*
	 * @param seller
	 * This method is responsible for persiting seller into database
	 */

	@Override
	public void save(Seller seller) {
		// TODO Auto-generated method stub

		sellerRepository.save(seller);
	}

	@Override
	public Seller findByUserName(String username) {
		// TODO Auto-generated method stub

		return sellerRepository.findByUserNameIgnoreCase(username);
	}

	@Override
	public Seller findByEmail(String email) {
		// TODO Auto-generated method stub

		return sellerRepository.findByEmailIgnoreCase(email);
	}

}
