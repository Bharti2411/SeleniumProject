package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
WebDriver cd;
void beforeSuite()
	{
	System.out.println("BeforeSuite");
	}
 @Parameters("https://demowebshop.tricentis.com/")
 @BeforeClass
 public void launchBrowser(String url) {
	 cd= new ChromeDriver();
	 cd.manage().window().maximize();
	 cd.get(url);
	 cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
 }
 @AfterMethod
 public void afterMethod()
 {
	 cd.findElement(By.xpath("//a[@class='ico-login']")).click();
 }
}
