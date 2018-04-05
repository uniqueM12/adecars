/**
 * 
 */
package com.adecars.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adecars.dao.ModelRepository;
import com.adecars.models.Seller;
import com.adecars.service.MakeService;
import com.adecars.service.SellerService;

/**
 * Since 22:59:24 | 10 Sep 2017
 *
 * @author uniqueM
 */

@Controller
public class HomeController {

	@Autowired
	SellerService sellerService;

	@Autowired
	ModelRepository modelRepository;

	@Autowired
	MakeService makeService;

	private final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/")
	public String index() {

		logger.debug("index() is executing...");

		return "redirect:/home";

	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(ModelMap model) {

		logger.debug("home() has been called");
		Seller seller = new Seller();
		model.addAttribute("seller", seller);
		return "home";
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String signUp(@Valid @ModelAttribute("seller") Seller seller, BindingResult bindingResult, ModelMap model) {

		logger.debug("signUp() has been called");

		if (bindingResult.hasErrors() || !(seller.getpWord().contentEquals(seller.getpWord2()))) {

			for (FieldError error : bindingResult.getFieldErrors()) {
				System.out.println(error.getRejectedValue() + error.getDefaultMessage());
			}
			return "home";
		} else if ((sellerService.findByUserName(seller.getUserName()) != null) || (sellerService.findByEmail(seller
				.getEmail()) != null)) {

			if (sellerService.findByUserName(seller.getUserName()) != null) {

				model.addAttribute("usedUserName", "The Username you supplied has already been used");
				System.out.println("The Username you supplied has already been used");
			}
			if (sellerService.findByEmail(seller.getEmail()) != null) {

				model.addAttribute("usedEmail", "The email address you supplied has been used ");
				System.out.println("The email address you supplied has been used ");
			}
			return "home";
		} else {
			sellerService.save(seller);
		}
		return "post-vehicle";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String logIn(Seller seller, ModelMap model) {

		logger.debug("Login() has been called");

		Seller seller2 = new Seller();
		if ((sellerService.findByUserName(seller.getUserName()) != null) && (sellerService.findByEmail(seller
				.getEmail()) != null)) {
			System.out.println(seller.getUserName() + " " + seller.getpWord());
			model.addAttribute("incorrectUOrP", "The username/email or password you entered is not correct");
			return "home";
		} else if ((sellerService.findByUserName(seller.getUserName()) != null)) {
			System.out.println("Id by username");
			seller2 = sellerService.findByUserName(seller.getUserName());
			if (seller.getpWord().equals(seller2.getpWord())) {
				System.out.println("Match!!!");
				Seller realSeller = seller2;
				model.addAttribute("seller", realSeller);
				return "vehicle/post-vehicle";
			} else {
				model.addAttribute("incorrectUOrP", "The username/email or password you entered is not correct");
				return "home";
			}
		} else if ((sellerService.findByEmail(seller.getUserName()) != null)) {
			System.out.println("ID by email");
			if (seller.getpWord().equals(seller2.getpWord())) {
				Seller realSeller = seller2;
				model.addAttribute("seller", realSeller);
				return "vehicle/post-vehicle";
			} else {
				model.addAttribute("incorrectUOrP", "The username/email or password you entered is not correct");
				return "home";
			}
		}
		return "home";
	}
}
