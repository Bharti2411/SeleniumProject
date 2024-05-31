package listerners;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.listerner.DwsBaseClass;
import com.crm.listerner.ExcelFileUtils;
import com.crm.listerner.ReadDataFrmProperties;
@Listeners( com.crm.listerner.dws.class)
public class GiftToCart extends DwsBaseClass {
			ExcelFileUtils ps = new ExcelFileUtils();

				@Test
				public void fillForm() throws IOException, InterruptedException {

					driver.findElement(By.xpath("//a[@href='/gift-cards']")).click();
					String RName = ps.getDataFRomExcel("Sheet1", 0, 1);
					String REmail = ps.getDataFRomExcel("Sheet1", 1, 1);


					driver.findElement(By.xpath("(//div[@class='picture'])[6]")).click();

					
					driver.findElement(By.cssSelector("input[class='recipient-name']")).sendKeys(RName);

					driver.findElement(By.cssSelector("input[class='recipient-email']")).sendKeys(REmail);

					driver.findElement(By.cssSelector("input[class='qty-input']")).clear();

					driver.findElement(By.cssSelector("input[class='qty-input']")).sendKeys("5");

					driver.findElement(By.cssSelector("input[id='add-to-cart-button-1']")).click();

		

	}

				public void clickGC() {
					// TODO Auto-generated method stub
					
				}
			}
	

