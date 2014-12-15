package com.itu.websecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebSecurityHomeController {

	String message = "This course was helpful in learning the basic fundamental knowledge of computer network security model. Have learned OSI model, Routing Protocols, IP Addresses and Subnetting, MAC addressing. Have got idea on firewall, switch, router, Vlans, Basic router configuration, Computer network router, VPN(virtual private network), router switch configuration, How to break password step-by-step, Cryptography. Course was very helpful in understanding how the security holds in internet world. ";

	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue= "world") String name) {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

}
