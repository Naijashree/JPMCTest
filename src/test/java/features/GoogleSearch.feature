@userflow
Feature: Google search for JPMMC and VAlidates the Logo on JPMC website

@LandOnGoogleSearchPage
Scenario: Navigate to Google landing Page

Given Initialize the browser with "chrome"
When Navigate to "https://www.google.com/" site
Then Validate Google logo


When Search box is visible in landing page
And User enters text "J.P. Morgan"
And User clicks on search Button
Then results for JpMorgan is shown


When User clicks on First link
And User lands on JPMC landing page and logo should be displayed
Then Brower should be closed


