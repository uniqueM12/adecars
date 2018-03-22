/**
 * 
 */
package com.adecars.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adecars.models.Car;
import com.adecars.service.CarService;
import com.adecars.service.MakeService;
import com.adecars.service.ModelService;
import com.adecars.service.SellerService;

/**
 * Since 11:26:35 | 20 Oct 2017
 *
 * @author uniqueM
 */

@Controller
@RequestMapping(value = "/vehicle/")
public class CarController {

	@Autowired
	CarService carService;

	@Autowired
	SellerService sellerService;

	@Autowired
	MakeService makeService;

	@Autowired
	ModelService modelService;

	private final Logger logger = LoggerFactory.getLogger(CarController.class);

	@RequestMapping(value = "post-vehicle", method = RequestMethod.GET)
	public String postVehicleForm(ModelMap model) {

		logger.debug("postVehicleForm() has been called");

		Car car = new Car();
		/*
		 * Seller seller = sellerService.findByUserName(userName);
		 * car.setSeller(seller);
		 */
		model.addAttribute("car", car);
		model.addAttribute("makes", makeService.findAll());
		return "vehicle/post-vehicle";
	}

	@RequestMapping(value = "post-vehicle", method = RequestMethod.POST)
	public String postVehicle(@Validated Car car, BindingResult bindingResult) throws IOException {

		if (bindingResult.hasErrors()) {
			return "vehicle/post-vehicle";
		} else {
			carService.save(car);
		}
		logger.debug("is trying to post a new vehicle");

		return "profile";
	}

}
