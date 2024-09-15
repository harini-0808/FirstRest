package com.handson.rest;


import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/v2")
public class Greet2 {

	@GetMapping("/greet")
	public ResponseEntity<String> name() {
		//return ResponseEntity.status(200).body("hey from version 2");
		return new ResponseEntity<String>("hey from version 2",HttpStatus.OK);
		
	}
	
	@GetMapping("/time")
	public ResponseEntity<String> getTime() {
		return new ResponseEntity<String>(Calendar.getInstance().getTime()+"", HttpStatus.OK);
	}
	
	@GetMapping("/gender/{gender}")
	public String genderMessage(@PathVariable String gender) {
		return gender.equals("f") ? "Hi Miss" : gender.equals("m") ? "Hi Mister" : "Hi";
	}
	
	@GetMapping("/greet/{name}/{gender}")
	public String greetBasedOnGender(@PathVariable String name, @PathVariable String gender) {
		return "Hi "+ (gender.equals("m") ? "Mr" : gender.equals("f") ? "Ms" : "") + " "+name;
	}
	
	@PostMapping("/member")
	public ResponseEntity<String> memberInfo(@RequestBody Member member){
		if(member.getGender().equals("female"))
			return ResponseEntity.ok("hi miss "+member.getName());
		else
			return ResponseEntity.ok("hi mister "+member.getName());
			
	}
	
	@GetMapping("/header-test")
	public ResponseEntity<?> testHeaders(@RequestHeader HttpHeaders headers){
		Set<String> set = headers.keySet();
		Iterator<String> keys = set.iterator();
		String keyStr = null;
		
		while(keys.hasNext()) {
			keyStr+="\n"+keys.next();
		}
		
		String keyValueStr = null;
		Set<Entry<String, List<String>>> entries = headers.entrySet();
		Iterator itr = entries.iterator();
		while(itr.hasNext()) {
			keyValueStr+= itr.next()+"<br/>";
		}
		
		HttpHeaders headers2 = new HttpHeaders();
		headers2.setContentType(MediaType.TEXT_HTML);
		headers2.set("ust", "room6");
		return ResponseEntity.status(200).headers(headers2).body(keyValueStr);
		
	}
	
	

}
