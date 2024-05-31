package IRetryInt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DwsLogin extends DwsLogin{
	@Test(RetryAnalyzer= com.crm.listerner.dws)
	public void loginDWS(String username, String pass) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.cssSelector("//input[value='Log in']")).click();
		driver.close();
		
	
}

}
