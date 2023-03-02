package samplescript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CabRequestFlow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandhyan\\Desktop\\LocalWorkspace\\TestProject\\driver\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp");
		//Thread.sleep(5000);
		//1.Basic Xpath
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("vuramitem@vuram.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		//2. Xpath Using Following *[@type='text']//following::input
		String a = driver.findElement(By.xpath("//*[@class='SizedText---medium SizedText---predefined']//following::span[45]")).getText();
		System.out.println("Value of a ="+a);
		driver.findElement(By.xpath("//*[@class='SizedText---medium SizedText---predefined']//following::span[45]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Submit a Request']//parent::strong[1]")).click();
		//Thread.sleep(5000);
		

	}

}
