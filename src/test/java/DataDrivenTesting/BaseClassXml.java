package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;  
import org.testng.annotations.Test;
public class BaseClassXml {
	WebDriver driver;
	@Test
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("precondition for test Runner");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("precondition for test Runner");
	}
	@Parameters("url")
	@BeforeClass
	public void beforeClass(String url) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
	}
	@Parameters({"username","password"})
	@BeforeMethod
	public void beforeMethod(String username,String password) {
		driver.findElement(By.cssSelector("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.cssSelector("//input[value='Log in']")).click();
		
	}
	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}

}
