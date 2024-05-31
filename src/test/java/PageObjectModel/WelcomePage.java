package PageObjectModel;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WelcomePage {

	private static final List<WebElement> String = null;
	private Object mainWindow;
	

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	@Test
	public void clickOnFs() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WelcomePage wp =new WelcomePage(driver);
		
		List<WebElement> list= wp.getList();
		
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow.toString() + "main window");
		for (WebElement webElement : list) {
			webElement.click();
			Set<String> allWindow = driver.getWindowHandles();
			// System.out.println(allWindow);

			for (String windowhandle : allWindow) {
				if (!windowhandle.equals(mainWindow)) {
					String han = driver.switchTo().window(windowhandle).getTitle();
					System.out.println(han + "handle name");
					driver.close();
					Thread.sleep(2000);
					driver.switchTo().window(mainWindow);
					String currURL = driver.getCurrentUrl();
					
					if (currURL.equals("https://demowebshop.tricentis.com/news/rss/1")) {
							//need to use autoIt
					}
				}
			}

		}
		Thread.sleep(2000);

	}

	private List<WebElement> getList() {
		// TODO Auto-generated method stub
		return null;
	}


	}


