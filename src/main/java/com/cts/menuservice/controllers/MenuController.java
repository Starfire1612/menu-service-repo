package com.cts.menuservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

	@GetMapping(path = "/")
	public String greetUser() {
		return "Welcome Admin!";
	}
}
