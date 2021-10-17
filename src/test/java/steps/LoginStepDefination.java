package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Mainpage;
import pages.TestBase;

public class LoginStepDefination extends TestBase{
	Mainpage mainpage;
	
	
	@Before
	public void beforeRun() {
		initDriver();
		mainpage=PageFactory.initElements(driver,Mainpage.class);
	}
	
	@Given ("^set skyBlue Background button exists$")
	public void set_skyBlue_Background_button_exists() {
		
	}
	
	
	@When ("^User click on  set skyBlue Background$")
	public void user_click_on_set_skyBlue_Background() {
		
	}
	@Then("^User should be on skyblue background$")
	public void user_should_be_on_skyblue_background() throws Throwable {
	   
	}

	@Given("^set skyWhite Background button exists$")
	public void set_skyWhite_Background_button_exists() throws Throwable {
	    
	}

	@When("^User click on  set skywhite Background$")
	public void user_click_on_set_skywhite_Background() throws Throwable {
	   
	}

	@Then("^User should be on skywhite background$")
	public void user_should_be_on_skywhite_background() throws Throwable {
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
