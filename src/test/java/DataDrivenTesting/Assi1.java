package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assi1 {
	
@Test
public void readData() throws IOException, InterruptedException {
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("./ConfigFile/DWSFile.properties");
		prop.load(fis);
		String url= prop.getProperty("https://www.vtiger.com//");
		String username= prop.getProperty("username");
		String password= prop.getProperty("password");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
}
}

