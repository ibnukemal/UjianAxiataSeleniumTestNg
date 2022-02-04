package com.juaracoding.gist.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.gist.driver.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "body > div.position-relative.js-header-wrapper > div > div.Header-item.f4.mr-0 > a.HeaderMenu-link.no-underline.mr-3")
	private WebElement btnLogin;
	
	public void clikLogin() {
		btnLogin.click();
	}
	
	@FindBy(id = "login_field")
	private WebElement formUsername;
	
	@FindBy(id = "password")
	private WebElement formPassword;

	public void inputLogin(String username, String password) {
		formUsername.sendKeys(username);
		formPassword.sendKeys(password);
	}
	
	@FindBy(css = "#login > div.auth-form-body.mt-3 > form > div > input.btn.btn-primary.btn-block.js-sign-in-button")
	private WebElement btnSignIn;
	
	public void clickSignIn() {
		btnSignIn.click();
	}
}
