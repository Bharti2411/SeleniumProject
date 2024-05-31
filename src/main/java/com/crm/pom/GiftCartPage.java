package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCartPage {
	
	public void GiftCartPage() {
		
	}
	public GiftCartPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	private @FindBy(xpath="//ul[@class='top-menu']/li[7]")
    WebElement giftcart;
	
	public void clickGC() {
		giftcart.click();
	}
}
