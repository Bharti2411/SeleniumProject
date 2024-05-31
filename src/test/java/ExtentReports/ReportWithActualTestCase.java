package ExtentReports;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.crm.listerner.DwsBaseClass;
import com.crm.pom.DwsLoginPage;

public class ReportWithActualTestCase extends DwsBaseClass {
	ExtentReports report;
	ExtentTest Test;
	@Test
		public void dwsloginCorrect() {
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			DwsLoginPage dws= new DwsLoginPage(driver);
			dws.username("admin01@gmail.com");
			dws.password("admin02");
			dws.login_button();
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
			
	}
	@Test
	public void dwsLoginwrong() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']"));
		DwsLoginPage dws= new DwsLoginPage(driver);
		dws.username("admin01@gmail.com");
		dws.password("admin02");
		dws.login_button();
		Test.log(Status.FAIL,"failed due to dwsLogin");
	}
		@Test
		public void redbus() {
			driver.get("https://www.redbus.in/");
			assertEquals("bharti","panchabhai");
		}
		
}

