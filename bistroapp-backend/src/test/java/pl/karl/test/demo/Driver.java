package pl.karl.test.demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper = new ObjectMapper();
		
		Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);

		System.out.println("theStudent firstName: " + theStudent.getFirstName());
	}

}
