package com.test.spring.webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.spring.webapp.service.SignIn;
import com.test.spring.webapp.service.SignInServices;


@RestController
public class MailController {
	
	private SignIn account = new SignInServices();
	
	@RequestMapping("/Signin")
	public String accountsignin(@RequestParam String username, @RequestParam String password){
		account.Sign(username,password);
		return " Signin Succesful";
	}
	
	

}