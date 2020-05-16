package qaclickacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	WebDriver driver = null;
	@Test
	public void browserAutomation()
	{
		System.out.println("browserAutomation");
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sonia\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public void elementsUI()
	{
		System.out.println("elementsUI");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sonia\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.className("NKcBbd")).click();
	}
}
