package be.abis.exercise.model;

public class Company {
	
	private String name;
	private Address address;
	
	public Company(String name, Address address) {
		this.name = name;
		this.address = address;
	}


	// business

	public  double calculateTaxToPay(){
		if ("BE".equals(this.getAddress().getCountryCode())){
			return 51.0;
		} else if ("NL".equals(this.getAddress().getCountryCode())){
			return 47.0;
		} else return 35.0;
	}


	// getset

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	

}
