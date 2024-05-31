package Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DwsAppUsingMethod {
private WebDriver driver;
@Test
@BeforeMethod
public void beforeMethod() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	JavascriptExecutor js= (JavascriptExecutor)driver;
    Thread.sleep(3000);
	js.executeScript("window.scrollTo(0,666);");
	Thread.sleep(2000);
	js.executeScript("window.scrollTo(0,-666);");
	
}
@AfterMethod
public void afterMethod() {
	driver.findElement(By.xpath("//a[text()='Facebook']")).click();
}
}
