package DataDrivenTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataAddToProducts {
	@Test
	public void addToProduct() throws InterruptedException {
		//open the browser
		WebDriver driver= new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//implicitly the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into dws page
		driver.get("https://demowebshop.tricentis.com/");
		//doing login
		driver.findElement(By.cssSelector("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.cssSelector("//input[@value='Log in']")).click();
		//click digital download link
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads']")).click();
		//add the products by using findElements
		List<WebElement> products= driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement web: products) {
			web.click();
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
