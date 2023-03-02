package samplescript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaveRequestFlow {
	
	public void submitLeaveReq() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandhyan\\Desktop\\LocalWorkspace\\TestProject\\driver\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp");
		Thread.sleep(5000);
		//1.Basic Xpath
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("vuramitem@vuram.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//2. Xpath Using Following *[@type='text']//following::input
		String a = driver.findElement(By.xpath("//*[@class='SizedText---medium SizedText---predefined']//following::span[40]")).getText();
		System.out.println("Value of a ="+a);
		driver.findElement(By.xpath("//*[@class='SizedText---medium SizedText---predefined']//following::span[40]")).click();
		Thread.sleep(5000);
		//3. Xpath Using ancestor Xpath=//*[@type='submit']//ancestor::
		//StrongText---richtext_strong
		String b =driver.findElement(By.xpath("//a[@class='LinkedItem---standalone_richtext_link LinkedItem---inStrongText elements---global_a']//ancestor::div[1]")).getText();
		System.out.println("Value of b ="+b);
		driver.findElement(By.xpath("//a[@class='LinkedItem---standalone_richtext_link LinkedItem---inStrongText elements---global_a']//ancestor::div[1]")).click();
		Thread.sleep(5000);
		//4.Xpath using Parent
		driver.findElement(By.xpath("//a[text()='Submit a Request']//parent::strong[1]")).click();
		Thread.sleep(5000);
		//5.Xpath using Child
		//driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']//ancestor::div[1]")).sendKeys("02/14/2023");
		driver.findElement(By.xpath("//div[@class='DatePickerWidget---input_container']//child::input")).click();
		driver.findElement(By.xpath("//div[@class='DatePickerWidget---input_container']//child::input")).sendKeys("02/14/2023");
		driver.findElement(By.xpath("//input[@id='e10f86ca7d3cb8e53772043aba9137a4']//self::input")).click();
		driver.findElement(By.xpath("//input[@id='e10f86ca7d3cb8e53772043aba9137a4']//self::input")).sendKeys("02/15/2023");
		
		
		}

}
