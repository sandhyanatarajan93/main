package samplescript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\sandhyan\\Desktop\\LocalWorkspace\\TestProject\\driver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

				driver.get("https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp");

				// 1.Basic Xpath
				driver.findElement(By.xpath("//input[@id='un']")).sendKeys("vuramitem@vuram.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
				driver.findElement(By.xpath("//input[@value='Sign In']")).click();

				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				Robot robot = new  Robot();
				
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(5000);
				robot.keyPress(KeyEvent.VK_UP);
				robot.keyPress(KeyEvent.VK_UP);
				robot.keyPress(KeyEvent.VK_UP);
				robot.keyPress(KeyEvent.VK_UP);
	}

}
