package practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class TaskTwo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Work\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);

		// maximize the window 
		driver.manage().window().maximize();
		// here we use implicit wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		String pageTitle = driver.getTitle(); // get page tile
		System.out.println(pageTitle);

		driver.navigate().to("https://www.facebook.com/");
		String pageURL = driver.getCurrentUrl(); // get page url
		System.out.println(pageURL);

		// here we assert the result
		Assert.assertEquals(pageURL, "https://www.facebook.com/");

		driver.quit();

	}

}
