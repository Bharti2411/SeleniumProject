package com.crm.advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void m1()
	{
		WebDriver  cd= new ChromeDriver();
		cd.get("https://www.pantaloons.com/");
	}
}
