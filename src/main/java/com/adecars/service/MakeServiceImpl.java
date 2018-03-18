/**
 * 
 */
package com.adecars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adecars.dao.MakeRepository;
import com.adecars.models.Make;

/**
 * Since 02:01:35 | 11 Sep 2017
 *
 * @author uniqueM
 */

@Service
public class MakeServiceImpl implements MakeService {

	@Autowired
	MakeRepository makeRepository;

	@Override
	public void save(Make make) {
		// TODO Auto-generated method stub

		makeRepository.save(make);
	}

	@Override
	public Make findOne(String make) {
		// TODO Auto-generated method stub

		return makeRepository.findOne(make);
	}

	@Override
	public List<Make> findAll() {
		// TODO Auto-generated method stub

		// System.out.println("they are");
		// List<Make> makes = makeRepository.findAll();
		//
		// for (Iterator<Make> iterator = makes.iterator(); iterator.hasNext();) {
		// Make type = iterator.next();
		// System.out.println(type);
		// }

		return makeRepository.findAll();
	}

}
