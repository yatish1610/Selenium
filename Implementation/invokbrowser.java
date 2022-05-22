package Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class InvokingBrowser {


	public static void main(String[] args) throws InterruptedException 
	{


		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Chrome Opened");
		Thread.sleep(3000);
		driver.close();

		System.out.println("Chrome Closed");

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.google.com/");
		System.out.println("FireFox Opened");
		Thread.sleep(3000);
		driver2.close();
		System.out.println("FireFox Closed");
		System.out.println("Successfully automated!!!");
	}

}