package com.bj58.pay.magic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashBoardController {

	@RequestMapping(path = {"test"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String test() {


		return "test";

	}


}
