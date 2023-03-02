package samplescript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public  static WebDriver initialize() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandhyan\\Desktop\\LocalWorkspace\\TestProject\\driver\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	

}
