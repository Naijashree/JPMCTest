$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Google search for JPMMC and VAlidates the Logo on JPMC website",
  "description": "",
  "id": "google-search-for-jpmmc-and-validates-the-logo-on-jpmc-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@userflow"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Navigate to Google landing Page",
  "description": "",
  "id": "google-search-for-jpmmc-and-validates-the-logo-on-jpmc-website;navigate-to-google-landing-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@LandOnGoogleSearchPage"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Initialize the browser with \"chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Navigate to \"https://www.google.com/\" site",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Validate Google logo",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Search box is visible in landing page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User enters text \"J.P. Morgan\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks on search Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "results for JpMorgan is shown",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User clicks on First link",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User lands on JPMC landing page and logo should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Brower should be closed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 29
    }
  ],
  "location": "GoogleSearchStepDefination.initialize_the_browser_with(String)"
});
formatter.result({
  "duration": 5899161101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com/",
      "offset": 13
    }
  ],
  "location": "GoogleSearchStepDefination.navigate_to_site(String)"
});
formatter.result({
  "duration": 4517454000,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchStepDefination.validate_Google_logo()"
});
formatter.result({
  "duration": 378148900,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchStepDefination.search_box_is_visible_in_landing_page()"
});
formatter.result({
  "duration": 137346900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J.P. Morgan",
      "offset": 18
    }
  ],
  "location": "GoogleSearchStepDefination.user_enters_text(String)"
});
formatter.result({
  "duration": 271102200,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchStepDefination.user_clicks_on_search_Button()"
});
formatter.result({
  "duration": 4565736500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchStepDefination.results_for_JpMorgan_is_shown()"
});
formatter.result({
  "duration": 86992299,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchStepDefination.user_clicks_on_First_link()"
});
formatter.result({
  "duration": 45171018500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchStepDefination.user_lands_on_JPMC_landing_page_and_logo_should_be_displayed()"
});
formatter.result({
  "duration": 167711101,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchStepDefination.brower_should_be_closed()"
});
formatter.result({
  "duration": 693822099,
  "status": "passed"
});
});