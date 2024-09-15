//package com.locale.test;
//
//import java.util.List;
//import java.util.Locale.LanguageRange;
//import java.util.Map.Entry;
//import java.util.Set;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/rest/api")
//public class Controller {
//
//	@GetMapping("/test")
//	public ResponseEntity<String> test() {
//		return ResponseEntity.status(200).body("it's running");
//	}
//	
//	@GetMapping("/locale")
//	public ResponseEntity<String> testLocale(@RequestHeader HttpHeaders headers){
//		String lang = "";
//		for(Entry<String,List<String>> entry : headers.entrySet()) {
//			
//			if(entry.getKey().equals("accept-language"))
//				lang = entry.getValue().get(0);
//		}
//		if(lang.equals("fr"))
//			return ResponseEntity.status(200).header("Content-Language", "fr").body("welcome");
//		
//		return ResponseEntity.ok("nah");
//			
//	}
//}
