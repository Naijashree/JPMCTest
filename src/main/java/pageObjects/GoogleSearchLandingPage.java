package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchLandingPage {

	public WebDriver driver;
	
	
	@FindBy(xpath="//img[@alt='Google']")
	WebElement googleLogo;
	
	@FindBy(css="input[title='Search']")
	WebElement searchTextBox;
	
	@FindBy(css="input[type='submit']")
	WebElement submitButton;
	
	
	
	public GoogleSearchLandingPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getGoogleLogo() {
		return googleLogo;
	}
	
	
	public WebElement getTextBox() {
		return searchTextBox;
	}
	
	public WebElement getSubmitButton() {
		return submitButton;
	}
		
	
}

