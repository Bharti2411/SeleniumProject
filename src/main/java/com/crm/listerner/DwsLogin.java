package com.crm.listerner;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	@Listeners(com.crm.listerner.dws.class)
	public class DwsLogin {
		public void login() {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("admin01");
			driver.findElement(By.xpath("//input[@value='Loggg in']")).click();
			driver.close();
	}
		@Test
		public void redbus() {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.redbus.in/");
			driver.close();
		}
		@Test(dependsOnMethods = "login")
		public void manidum() {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://manis.in/");
			driver.close();
		}

	}


