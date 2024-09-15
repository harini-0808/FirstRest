package com.handson.rest;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/v1")
public class Greet {

	@GetMapping("/greet")
	public String name() {
		return "greetings";
		
	}
	
	@GetMapping("/time")
	public String getTime() {
		return Calendar.getInstance().getTime()+"";
	}
	
	@GetMapping("/gender/{gender}")
	public String genderMessage(@PathVariable String gender) {
		return gender.equals("f") ? "Hi Miss" : gender.equals("m") ? "Hi Mister" : "Hi";
	}
	
	@GetMapping("greet/{name}/{gender}")
	public String greetBasedOnGender(@PathVariable String name, @PathVariable String gender) {
		return "Hi "+ (gender.equals("m") ? "Mr" : gender.equals("f") ? "Ms" : "") + " "+name;
	}
	

}
