package stepDefinations;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.GoogleSearchLandingPage;
import pageObjects.JPMCLandingPage;
import pageObjects.SearchResultPage;
import resources.base;

public class GoogleSearchStepDefination extends base {

	GoogleSearchLandingPage gslp;
	SearchResultPage srp;
	JPMCLandingPage jpmclandingpage;

	@Given("^Initialize the browser with \"([^\"]*)\"$")
	public void initialize_the_browser_with(String arg1) throws Throwable {
		driver = initializeDriver();

	}

	@When("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@Then("^Validate Google logo$")
	public void validate_Google_logo() throws Throwable {

		gslp = new GoogleSearchLandingPage(driver);
		Assert.assertTrue(gslp.getGoogleLogo().isDisplayed());
	}

	@When("^Search box is visible in landing page$")
	public void search_box_is_visible_in_landing_page() throws Throwable {
		gslp = new GoogleSearchLandingPage(driver);
		Assert.assertTrue(gslp.getTextBox().isDisplayed());

	}

	@When("^User enters text \"([^\"]*)\"$")
	public void user_enters_text(String arg1) throws Throwable {
		gslp = new GoogleSearchLandingPage(driver);
		gslp.getTextBox().sendKeys(arg1);

	}

	@When("^User clicks on search Button$")
	public void user_clicks_on_search_Button() throws Throwable {
		gslp = new GoogleSearchLandingPage(driver);
		gslp.getSubmitButton().click();

	}

	@When("^results for JpMorgan is shown$")
	public void results_for_JpMorgan_is_shown() throws Throwable {
		srp = new SearchResultPage(driver);
		Assert.assertTrue(srp.getFirstLink().isDisplayed());

	}

	@When("^User clicks on First link$")
	public void user_clicks_on_First_link() throws Throwable {
		srp = new SearchResultPage(driver);
		srp.getFirstLink().click();

	}

	@When("^User lands on JPMC landing page and logo should be displayed$")
	public void user_lands_on_JPMC_landing_page_and_logo_should_be_displayed() throws Throwable {
		jpmclandingpage = new JPMCLandingPage(driver);
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(jpmclandingpage.getJpmcLogo()));
		Assert.assertTrue(jpmclandingpage.getJpmcLogo().isDisplayed());
		

	}

	@Then("^Brower should be closed$")
	public void brower_should_be_closed() throws Throwable {
		driver.close();
		
	}

}
