package DataProvider;

import java.time.Duration;

import javax.imageio.IIOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

private static final String DataProviderUtility = null;
@Test(dataProvider="sender")
public void receiver(String gmail, String pwd){
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.id("Email")).sendKeys(gmail);
	driver.findElement(By.id("Password")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
	
	@DataProvider(name="sender") 
	public Object[] [] sender() throws EncryptedDocumentException, IIOException{
	Object [] [] obj = new Object[2][2];
	obj[0][0]="admin01@gmail.com";
	obj[0][0]="admin01";
	obj[0][1]="admin02@gmail.com";
	obj[1][0]="Admin02";
	return DataProviderUtility.dwsLogin();
	}
}

