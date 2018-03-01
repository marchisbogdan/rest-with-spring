package com.packtpub.restwithspring.restwithspring.contollers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/greeting")
public class GreetingController {
	private final String connectionTestResponse = "Succesfull test connection!";

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String connectionTestEndpoint() {
		LocalDateTime ldt = LocalDateTime.now();
		return connectionTestResponse + ldt.toString();
	}
}
