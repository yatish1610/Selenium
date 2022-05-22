package Implementationn;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecution {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("alert('welcome')");
		
		Thread.sleep(5000);
		js.executeScript("prompt('Enter your name')");
		
		Thread.sleep(3000);
		js.executeScript("confirm('Are you sure?')");
		
		Thread.sleep(2000);
		driver.close();
		
	}



}