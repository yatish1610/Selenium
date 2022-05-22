package Implementation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

        driver.get("https://www.bigbasket.com" );
		try
		{
			WebElement myLink = driver.findElement(By.partialLinkText("Hello..."));
			myLink.click();
		}
		catch (Exception e) 
		{
			System.out.println("Register element is not found.");
			throw(e);
		}
		finally 
		{
			System.out.println("Hello");
			driver.quit();
		}
	}

}