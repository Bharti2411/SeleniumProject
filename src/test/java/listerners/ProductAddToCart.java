package listerners;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.listerner.DwsBaseClass;

@Listeners( com.crm.listerner.dws.class)

public class ProductAddToCart extends DwsBaseClass{
	@Test
	public void addToCart() throws InterruptedException {
       driver.findElement(By.xpath("(//a[@href='/digital-downloads'])[1]")).click();
		
		List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		for (WebElement web : products) {
			web.click();
		}
		Thread.sleep(3000);
		//driver.close();
		
		
	}
	


}

