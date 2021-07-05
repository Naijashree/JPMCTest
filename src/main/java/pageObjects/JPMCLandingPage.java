package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPMCLandingPage {
	
public WebDriver driver;
	
	
	@FindBy(xpath="(//img[@class='first-logo'])[2]")
	WebElement JpmcLogo;
	
	@FindBy(xpath="//i[@class='fas fa-home']")
	WebElement JpmcText;	
	
	
	public JPMCLandingPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getJpmcLogo() {
		return JpmcLogo;
	}
	
	public WebElement getJpmcText() {
		return JpmcText;
	}
	
	
}
