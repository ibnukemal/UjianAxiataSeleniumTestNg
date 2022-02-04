package com.juaracoding.gist.glue;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.juaracoding.gist.config.AutomationFrameworkConfig;
import com.juaracoding.gist.driver.DriverSingleton;
import com.juaracoding.gist.page.CreatePage;
import com.juaracoding.gist.page.LoginPage;
import com.juaracoding.gist.utils.ConfigProperties;
import com.juaracoding.gist.utils.Constant;

@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition extends AbstractTestNGSpringContextTests {
	
	private static WebDriver driver;
	private LoginPage login;
	private CreatePage create;
	
	@Autowired
	ConfigProperties configProperties;
	
	@Test(priority = 0)
	public void LoginGist() {
		DriverSingleton.getInstance(configProperties.getBrowser());
		driver = DriverSingleton.getDriver();
		driver.get(Constant.URL);
		
		login = new LoginPage();
		login.clikLogin();
		login.inputLogin(configProperties.getUsername(), configProperties.getPassword());
		login.clickSignIn();
	}
	
	@Test(priority = 1)
	public void CreateGist() {
		DriverSingleton.getInstance(configProperties.getBrowser());
		driver = DriverSingleton.getDriver();
		driver.get(Constant.URL);
		
		create = new CreatePage();
		create.clickCreate();
		create.insertGist(configProperties.getDescription(), configProperties.getTitle(), configProperties.getCode());
		create.submitGist();
	}
	
	
	
	
}
