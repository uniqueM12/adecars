/**
 * 
 */
package com.adecars.models;

import javax.persistence.Embeddable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Since 22:46:31 | 10 Sep 2017
 *
 * @author uniqueM
 */
@Document
@Embeddable
public class Seller {

	@Id
	@NotBlank(message = "User Name field cannot be empty")
	private String userName;

	@Email(message = "Enter a valide email address")
	@Size(min = 12, max = 60, message = "The First Email is not valid")
	private String email;

	@NotBlank
	@Size(min = 2, max = 60, message = "Choose A strong password that you can remember")
	private String pWord;

	@NotBlank(message = "Please enter a password and re-enter it here")
	private String pWord2;

	@NotBlank(message = "please enter a valide phone number")
	@Size(min = 5, max = 15, message = "The phone Number is not valid")
	private String phone1;

	@Size(min = 5, max = 15, message = "The phone Number is not valid")
	private String phone2;

	private Boolean terms_agree;

	public Seller() {
		// TODO Auto-generated constructor stub

	}

	public String getUserName() {
		// TODO Auto-generated method stub

		return userName;
	}

	public void setUserName(String userName) {
		// TODO Auto-generated method stub

		this.userName = userName;
	}

	public String getpWord() {
		// TODO Auto-generated method stub

		return pWord;
	}

	public void setpWord(String pWord) {
		// TODO Auto-generated method stub

		this.pWord = pWord;
	}

	public String getpWord2() {
		// TODO Auto-generated method stub

		return pWord2;
	}

	public void setpWord2(String pWord2) {
		// TODO Auto-generated method stub

		this.pWord2 = pWord2;
	}

	public String getEmail() {
		// TODO Auto-generated method stub

		return email;
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub

		this.email = email;
	}

	public String getPhone1() {
		// TODO Auto-generated method stub

		return phone1;
	}

	public void setPhone1(String phone1) {
		// TODO Auto-generated method stub

		this.phone1 = phone1;
	}

	public String getPhone2() {
		// TODO Auto-generated method stub

		return phone2;
	}

	public void setPhone2(String phone2) {
		// TODO Auto-generated method stub

		this.phone2 = phone2;
	}

	public Boolean getTerms_agree() {
		// TODO Auto-generated method stub

		return terms_agree;
	}

	public void setTerms_agree(Boolean terms_agree) {
		// TODO Auto-generated method stub

		this.terms_agree = terms_agree;
	}

	@Override
	public String toString() {
		return "Seller [userName=" + userName + ", pWord=" + pWord + ", pWord2=" + pWord2 + ", email=" + email
		        + ", phone1=" + phone1 + ", phone2=" + phone2 + ", terms_agree=" + terms_agree + "]";
	}

}