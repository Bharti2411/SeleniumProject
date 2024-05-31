package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import listerners.GiftToCart;

public class DwsGiftToCart {
	
PropertyFileUtils ps = new PropertyFileUtils();
	@Test
	public void giftcard() throws InterruptedException {
		
		String rname = ps.getDataFromPropertyFile("receName");
		String rEmail = ps.getDataFromPropertyFile("receEmail");
		String rName = ps.getDataFromPropertyFile("senderName");
		String rEmail1 = ps.getDataFromPropertyFile("SenderEmail");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		GiftToCart gf= new GiftToCart();
		Thread.sleep(2000);
		
		gf.clickGC();
		Thread.sleep(2000);
		gf.clickOngiftCard();
		Thread.sleep(2000);
		gf.getReceName(rName);
		Thread.sleep(2000);
		
	}

}
