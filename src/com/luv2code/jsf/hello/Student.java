package com.luv2code.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	private String firstName;
	private String lastName;
	private String country;
	
	//List of counrt for dropdown menu
	List<String> countryOptions;
	
	//create no-arg constructor
	public Student() {
		
		countryOptions = new ArrayList<>();
		
		countryOptions.add("Brazil");
		countryOptions.add("France");
		countryOptions.add("Germany");
		countryOptions.add("India");
		countryOptions.add("Turkey");
		countryOptions.add("United Kingdom");
		countryOptions.add("United States");	
			
	}
		
	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(List<String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	//define getter-setter methods

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
