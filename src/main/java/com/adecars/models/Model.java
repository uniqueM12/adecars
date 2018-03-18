/**
 * 
 */
package com.adecars.models;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Since 01:55:00 | 11 Sep 2017
 *
 * @author uniqueM
 */

@Document
@Embeddable
public class Model {

	@Id
	private String model;

	@NotNull
	@ManyToOne
	@Embedded
	private Make make;

	public Model() {
		// TODO Auto-generated constructor stub

	}

	public String getModel() {
		// TODO Auto-generated method stub

		return model;
	}

	public void setModel(String model) {
		// TODO Auto-generated method stub

		this.model = model;
	}

	public Make getMake() {
		// TODO Auto-generated method stub

		return make;
	}

	public void setMake(Make make) {
		// TODO Auto-generated method stub

		this.make = make;
	}

}
