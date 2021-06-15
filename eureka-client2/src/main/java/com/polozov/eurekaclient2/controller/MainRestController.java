package com.polozov.eurekaclient2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello. I am the Client #2";
	}
}
