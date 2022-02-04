package com.juaracoding.gist.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String myusername;
	
	@Value("${password}")
	private String password;
	
	@Value("${description}")
	private String description;
	
	@Value("${title}")
	private String title;
	
	@Value("${code}")
	private String code;
	
	
	public String getBrowser() {
		return browser;
	}

	public String getUsername() {
		return myusername;
	}

	public String getPassword() {
		return password;
	}

	public String getDescription() {
		return description;
	}

	public String getTitle() {
		return title;
	}

	public String getCode() {
		return code;
	}
	
	
	
}
