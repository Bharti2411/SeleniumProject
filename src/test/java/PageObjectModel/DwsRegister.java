package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.pom.DwsRegisterPage;

public class DwsRegister {
	@Test

	public void RegisterPage() {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		DwsRegisterPage rp= new DwsRegisterPage(driver);
		rp.register();
		rp.radioclick();
		rp.getLastName("Bharti");
		rp.getLastName("P");
		rp.getEmail("admin01@gmail.com");
		rp.getpass("admin01");
		rp.getpass("admin01");
		rp.clickRegiButton();
		
	}
		
	

}
