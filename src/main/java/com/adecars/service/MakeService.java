/**
 * 
 */
package com.adecars.service;

import java.util.List;

import com.adecars.models.Make;

/**
 * Since 01:05:08 | 11 Sep 2017
 *
 * @author uniqueM
 */

public interface MakeService {

	void save(Make make);

	Make findOne(String make);

	List<Make> findAll();
}
