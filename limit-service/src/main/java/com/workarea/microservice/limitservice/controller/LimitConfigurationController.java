package com.workarea.microservice.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workarea.microservice.limitservice.bean.LimitConfiguration;
import com.workarea.microservice.limitservice.config.Configuration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limit")
	public LimitConfiguration retrieveLimitConfig() {
		 return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}

}
