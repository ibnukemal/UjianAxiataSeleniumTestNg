package com.juaracoding.gist.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.gist.driver.DriverSingleton;

public class CreatePage {

private WebDriver driver;
	
	public CreatePage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css= "body > div.position-relative.js-header-wrapper > div > div:nth-child(6) > a")
	private WebElement btnCreate;
	
	public void clickCreate() {
		btnCreate.click();
	}
	
	@FindBy(css = "#gists > input")
	private WebElement txtDescription;
	
	@FindBy(css = "#gists > div.js-gist-file > file-attachment > div > div.file-header.d-flex.flex-items-center.pr-0 > div.input-group.gist-filename-input > input.form-control.js-gist-filename.js-blob-filename")
	private WebElement txtTitle;
	
	@FindBy(css = "#code-editor > div > pre")
	private WebElement txtCode;
	
	public void insertGist(String description, String title, String code) {
		txtDescription.sendKeys(description);
		txtTitle.sendKeys(title);
		txtCode.sendKeys(code);
	}
	
	@FindBy(css = "#new_gist > div > div.d-flex.flex-items-center.flex-justify-between > div > button")
	private WebElement btnSubmit;
	
	public void submitGist() {
		btnSubmit.click();
	}
	
	
}
