package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public   class DwsRegisterPage {

	public DwsRegisterPage() {
		// TODO Auto-generated constructor stub
	}
	
	public DwsRegisterPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	private @FindBy(linkText = "Register")
	WebElement linkRegister;
	
	public void register() {
		linkRegister.click();
	}
	
	private @FindBy(css = "input[id='gender-female']")
	WebElement femaleRadio;
	
	public void radioclick() {
		femaleRadio.click();
	}
	
	private @FindBy(css = "input[name='FirstName']")
	WebElement firstName;
	
	public void getFirstName(String value) {
		firstName.sendKeys(value);
	}
	
	private @FindBy(css = "input[name='LastName']")
	WebElement lastName;
	
	public void getLastName(String val) {
		lastName.sendKeys(val);
	}
	
	private @FindBy(css = "input[name='Email']")
	WebElement email;
	
	public void getEmail(String value) {
		email.sendKeys(value);
	}
	
	private @FindBy(css = "input[name='Password']")
	WebElement pass;
	
	public void getpass(String value) {
		pass.sendKeys(value);
	}
	private @FindBy(id = "ConfirmPassword")
	WebElement conPass;
	
	public void getConPass(String value) {
		conPass.sendKeys(value);
	}
	
	private @FindBy(css = "input[id='register-button']")
	WebElement regiButton;
	
	public void clickRegiButton() {
		regiButton.click();
	}
		
	}



