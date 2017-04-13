package com.test.spring.webapp.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SignInServices implements SignIn {

	private static final Log log1 = LogFactory.getLog(SignInServices.class);

	@Override
	public void Sign(String username, String password)
	{
		log1.info("Signin username is " + username);
		log1.info("Signin password is "+ password);
	}
}
