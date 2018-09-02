package telran.webservice.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleServiceHandler {
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello "+name;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}
	
	@PostMapping("/hello")
	public String[] helloArray(@RequestBody String[] words) {
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i]+"!";
		}
		return words;
	}

}
