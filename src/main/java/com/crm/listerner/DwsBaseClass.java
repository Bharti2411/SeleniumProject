package com.crm.listerner;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;  
	import org.testng.annotations.Test;
	
	public class DwsBaseClass {
		public WebDriver driver;
		public ReadDataFrmProperties ps =new ReadDataFrmProperties();
		
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("DataBase Connection");
		}
		@BeforeTest
		public void beforeTest() {
			System.out.println("pre-condition for testCase Runner");
		}
		
		@BeforeClass
		public void beforeClass() throws InterruptedException, IOException {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			String url=ps.getdatafromproperty("url");
			driver.get(url);
			
			
		}
		
		@BeforeMethod
		public void beforeMethod() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			Thread.sleep(2000);
			Properties prop= new Properties();
			FileInputStream fis= new FileInputStream("C:\\Users\\Bharti\\eclipse-workspace\\com.crm.advance\\src\\test\\resources\\DWSCredentials.properties");
			prop.load(fis);
			
			String un= ps.getdatafromproperty("username");
			String pass= ps.getdatafromproperty("password");
			
			driver.findElement(By.id("Email")).sendKeys(un);
			driver.findElement(By.id("Password")).sendKeys(pass);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
		}
		@AfterMethod
		public void afterMethod() {
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
		}
       @AfterClass
       public void afterClass() {
    	   driver.close();
	}
       @AfterTest
       public void afterTest() {
    	   System.out.println("Post condition for test Runner");
       }
       @AfterSuite
       public void afterSuite() {
    	   System.out.println("data base disconnection");
       }

}
