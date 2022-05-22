package Implementation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://trytestingthis.netlify.app");
		driver.manage().window().maximize();
		
		//Text box input
		driver.findElement(By.id("fname")).sendKeys("Harry");
		Thread.sleep(5000);
		driver.findElement(By.name("lname")).sendKeys("Potter");
		Thread.sleep(5000);
		
		//checking radio button
		driver.findElement(By.id("female")).click();
		Thread.sleep(5000);
		
		//selecting one option from drop down
		Select drpOptions = new Select(driver.findElement(By.id("option"))) ;
		drpOptions.selectByValue("option 2");
		Thread.sleep(5000);
		
		//selecting multiple options from table
		Select multiOptions = new Select(driver.findElement(By.name("Optionwithcheck[]")));
		multiOptions.selectByValue("option 2");
		multiOptions.selectByValue("option 3");
		Thread.sleep(5000);
		
		
		//checking check-box
		WebElement checkkBox = driver.findElement(By.name("option2"));
		checkkBox.click();
		Thread.sleep(5000);
	
		//selecting data from data-list
		driver.findElement(By.xpath("//body/div[3]/div[2]/form[1]/fieldset[1]/input[9]")).sendKeys("Suma");
		Thread.sleep(7000);
		
		//selecting date from calendar
		WebElement dateBox = driver.findElement(By.id("day"));
		dateBox.sendKeys("16061999"); 
		Thread.sleep(4000);
		
		System.out.println("...Successful...");
		driver.quit();
	}
}