/**
 * 
 */
package com.adecars.models;

import javax.persistence.Embeddable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Since 22:51:15 | 10 Sep 2017
 *
 * @author uniqueM
 */

@Document
@Embeddable
public class Make {

	@Id
	private String make;

	public Make() {
		// TODO Auto-generated constructor stub

	}

	public Make(String make) {
		this.make = make;
	}

	public String getMake() {
		// TODO Auto-generated method stub

		return make;
	}

	public void setMake(String make) {
		// TODO Auto-generated method stub

		this.make = make;
	}

	@Override
	public String toString() {
		return "Make [make=" + make + "]";
	}

}
