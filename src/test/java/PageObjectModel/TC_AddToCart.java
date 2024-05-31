package PageObjectModel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.pom.AddToCart;

public class TC_AddToCart {
	@Test
	public void addToCart() throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions action= new Actions(driver);
				
	  driver.manage().window().maximize();
	  driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
	  
	  AddToCart ac= new AddToCart();
	  Thread.sleep(2000);
	  WebElement digiDownload = ac.getDigitaldw();
	  Thread.sleep(2000);
	  action.moveToElement(digiDownload).click().perform();
	  
	 List<WebElement> listOfProducts =  ac.getProducts();
	  
	  for(WebElement list : listOfProducts) {
		  list.click();
	  }
	  Thread.sleep(2000);
	}

}

