package com.crm.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddToCart {
	@Test
	
	public void DwsAddToCartPage() {
		
	}
	public void AddToCart(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	private @FindBy(css="//a[@href='/digital-downloads'])[3]")
	WebElement digitaldws;
	
	public WebElement getDigitaldw() {
		return digitaldws;
	}
	
	private @FindBys(value=@FindBy(css="input[class='button-2 product-box-add-to-cart-button']"))
    List<WebElement> products;
    public List<WebElement> getProducts(){
    	System.out.println(products);
    	return products;
    }
		
}
