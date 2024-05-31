package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Task1 {
	//open the browser
	WebDriver driver = new ChromeDriver();
	//maximize the browser
	//driver.manage().window().maximize();
//enter into dws app
		//	driver.get("https://demowebshop.tricentis.com/");
  @BeforeMethod
  public void beforeMethod() {
	  
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.cssSelector("//input[@value='Log in']")).click();
		}
  @AfterMethod
  public void afterMethod() {
	  

	}

}
