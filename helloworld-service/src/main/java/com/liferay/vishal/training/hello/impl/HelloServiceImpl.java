package com.liferay.vishal.training.hello.impl;


import com.liferay.vishal.training.hello.api.api.HelloService;

import org.osgi.service.component.annotations.Component;

/**
 * @author vishalsrivastava
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = HelloService.class
)
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String parameter) {
		return parameter;
	}

}