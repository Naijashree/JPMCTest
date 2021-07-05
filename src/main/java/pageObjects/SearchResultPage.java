package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	
public WebDriver driver;
	
	
	@FindBy(xpath="//h3[contains(text(), 'J.P. Morgan | Official Website')]")
	WebElement firstLink;
	
	public SearchResultPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstLink() {
		return firstLink;
	}
	
}
