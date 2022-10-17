package be.abis.exercise.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Address {
	
	private String street;
	private String nr;
	private String zipCode;
	private String town;
	private String country;
	private String countryCode;
	
	public Address(String street, String nr, String zipCode, String town, String country, String countryCode) {
		this.street = street;
		this.nr = nr;
		this.zipCode = zipCode;
		this.town = town;
		this.country = country;
		this.countryCode = countryCode;
	}


	// business

	public Boolean isBelgianZipCodeNumeric(){
		if (zipCode == null){
			return false;
		}
		try {
			int zip = Integer.parseInt(zipCode);
		} catch (NumberFormatException e){
			return false;
		}
		return true;
	}

	public void writeToFile() throws IOException {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\temp\\javacourses\\JUnitAddress.txt"))) {
			writer.append(this.toString());
		}
	}

	@Override
	public String toString() {
		return "Address{" +
				"street='" + street + '\'' +
				", nr='" + nr + '\'' +
				", zipCode='" + zipCode + '\'' +
				", town='" + town + '\'' +
				", country='" + country + '\'' +
				", countryCode='" + countryCode + '\'' +
				'}';
	}

	// getset

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
