package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Mainpage {
	
	WebDriver driver;
		
	public Mainpage(WebDriver driver) {
		this.driver = driver;
	}
	
	
		@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/button[1]") WebElement Click_on_SkyBlue_Background;
		@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/button[2]") WebElement Click_on_skywhite_Background;
			
		
		
		 
}

