package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	
	public static WebDriver driver;


	public static void InitializeDriver()
	{
		System.setProperty("webdriver.gecko.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://tsrtconline.in/oprs-web/login/show.do");
		driver.manage().window().maximize();
		System.out.println("Site launched successfully!!");
		
	}
	

	public void CloseDriver()
	{
		driver.close();
	}
	

}
