package com.ranjen.jackson_databind_json_demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

//this is separate test program compared to other package. Just run as application here.
public class Driver {

	public static void main(String[] args) {

		try {
			
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON from file and map/convert to Java POJO
			//data/sample-full.json
			Customer myCustomer = mapper.readValue(new File("data/sample-full.json"), Customer.class);
			
			// also print individual items
			System.out.println("First name = " + myCustomer.getFirstName());
			System.out.println("Last name = " + myCustomer.getLastName());		

			// get nested object: array
			Address tempAddress = myCustomer.getAddress();
			System.out.println("Street = " + tempAddress.getStreet());		
			System.out.println("City = " + tempAddress.getCity());	
			
			//print out languages
			for(String tempLang : myCustomer.getLanguages()) {
				System.out.println(tempLang);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
