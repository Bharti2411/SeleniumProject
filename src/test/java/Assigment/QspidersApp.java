package Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersApp {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demoapps.qspiders.com/ui/formValidation");
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("Bharti");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bharti@123");
        driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("Bharti@123");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhartipanchabhai30@gmail.com");
        driver.findElement(By.xpath("//input[@name='url']")).sendKeys("https://demoapps.qspiders.com");
        
	}

}
