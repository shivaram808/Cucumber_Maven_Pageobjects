package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PageObjects.LoginPage;
import TestBase.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginVerifyScenarios extends BaseClass{

	
	
	
	@Given("^Login to TS RTC website using valid username and password$")
    public void login_to_TS_RTC_website_using_valid_username_and_password() throws Exception {
		
		LoginPage obj = new LoginPage(driver);
		obj.login();
	}

	@Then("^TSRTC Home page should be displayed$")
    public void tsrtc_Home_page_should_be_displayed() throws Exception {
		
		WebElement Logout_button = driver.findElement(By.xpath("//a[@title='Logout']"));
		
				if(Logout_button.isDisplayed())
		        System.out.println("Login Successfully!!");
		
	}
	
	
}
