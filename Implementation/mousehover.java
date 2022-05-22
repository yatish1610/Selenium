package Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class MouseHover {



	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch the URL 
		driver.get("https://demoqa.com/menu/");
		System.out.println("demoqa webpage Displayed");
		driver.manage().window().maximize();

		//Adding wait 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		//Instantiate Action Class        
		Actions actions = new Actions(driver);
		//Retrieve WebElement 'Music' to perform mouse hover 
		WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
		//Mouse hover menuOption 'Music'
		actions.moveToElement(menuOption).perform();
		System.out.println("Done Mouse hover on 'Music' from Menu");

		//Now Select 'Rock' from sub menu which has got displayed on mouse hover of 'Music'
		WebElement subMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Rock')]")); 
		//Mouse hover menuOption 'Rock'
		actions.moveToElement(subMenuOption).perform();
		System.out.println("Done Mouse hover on 'Rock' from Menu");

		//Now , finally, it displays the desired menu list from which required option needs to be selected
		//Now Select 'Alternative' from sub menu which has got displayed on mouse hover of 'Rock'
		WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
		selectMenuOption.click();
		System.out.println("Selected 'Alternative' from Menu");

		// Close the main window 
		driver.close();

	}


}