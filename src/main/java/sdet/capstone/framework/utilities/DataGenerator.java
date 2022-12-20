package sdet.capstone.framework.utilities;

import com.github.javafaker.Faker;

public class DataGenerator {
	
	public static String addressGenerator (String input) {
		Faker faker = new Faker();
		String output = "";
		
		if(input.equalsIgnoreCase("countryValue")) {
			output = "United States";
		} else if (input.equalsIgnoreCase("fullNameValue")) {
			output = faker.name().firstName();		
		} else if (input.equalsIgnoreCase("phoneNumberValue")) {
			output = faker.phoneNumber().cellPhone();
		} else if (input.equalsIgnoreCase("cardNumberValue")) {
			output = faker.number().digits(16);
		} else if (input.equalsIgnoreCase("nameOnCardValue")) {
			output = faker.name().fullName();
		} else if (input.equalsIgnoreCase("streetAddressValue")) {
			output = faker.address().streetAddress();
		} else if (input.equalsIgnoreCase("aptValue")) {
			output = faker.address().secondaryAddress();
		} else if (input.equalsIgnoreCase("cityValue")) {
			output = faker.address().city();
		} else if (input.equalsIgnoreCase("stateValue")) {
			output = faker.address().state();
		} else if (input.equalsIgnoreCase("zipCodeValue")) {
			String zipcode =faker.address().zipCode().substring(0, 5);
			output = zipcode;
		} 
		return output;
		
	}
	
}
