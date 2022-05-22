package Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonlyUsedCommands {


	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com");

		//get title
		String Title = driver.getTitle(); 
		System.out.println(Title);

		//get url
		String CurrentUrl = driver.getCurrentUrl();   
		System.out.println(CurrentUrl);

		//get page source
		String PageSource = driver.getPageSource();
		//System.out.println(PageSource);

		boolean result = driver.getPageSource().contains("String to find");
		System.out.println(result);

		System.out.println("Successfully automated!!!");
		Thread.sleep(4000);
		driver.close();
	}


}