package com.bj58.pay.magic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(path = {"/helloSpring", "/hehe"})
	public String helloSpring() {
		return "hello spring boot";
	}


}
