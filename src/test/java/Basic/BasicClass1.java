package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
@Test
public class BasicClass1 {

		//open the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		//driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into dws app
		//driver.get("https://demowebshop.tricentis.com/");
		@BeforeMethod
		public void beforeMethod() {
		driver.findElement(By.cssSelector("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.cssSelector("//input[@value='Log in']")).click();
		}
		@AfterMethod
		public void afterMethod() {
			driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		}
		@AfterClass
		public void afterClass() {
			driver.close();
		}
		@AfterTest
		public void afterTest() {
			System.out.println("post Condition for test Runner");
		
		}
		@AfterSuite
		public void afterSuite() {
			System.out.println("AfterSuite");
		}
		//click to digital download
		//driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		//driver.findElement(By.cssSelector("//input[@value='Add to cart']")).click();
		//driver.close();
	


	}
	


