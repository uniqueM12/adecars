/**
 * 
 */
package com.adecars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adecars.dao.ModelRepository;
import com.adecars.models.Model;

/**
 * Since 02:00:12 | 11 Sep 2017
 *
 * @author uniqueM
 */

@Service
@Transactional
public class ModelServiceImpl implements ModelService {

	@Autowired
	ModelRepository modelRepository;

	@Override
	public Model findByModel(String model) {

		return modelRepository.findByModel(model);
	}

}
