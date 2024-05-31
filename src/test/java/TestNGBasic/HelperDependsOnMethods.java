package TestNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperDependsOnMethods {
@Test(priority=3)
public void createAccount() {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.chennaisuperkings.com/");  //2nd execution
	System.out.println("Account is created");
}
@Test(priority=0,dependsOnMethods="createAccount")
public void modifyAccount() {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.royalchallengers.com/");   //3rd execution
	System.out.println("Account has been modified.....");
}
@Test(priority=2)
public void deleteAccount() {
	WebDriver driver= new ChromeDriver();  // 1st execution
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	System.out.println("Account has been deleted.....");
}
}
