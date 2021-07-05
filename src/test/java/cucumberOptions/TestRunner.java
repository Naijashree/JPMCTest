package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinations",
		format= {"pretty:target/cucumber-pretty.txt",
    	        "usage:target/cucumber-usage.json",
    	        "html:test-output",
    	        "json:json_output/cucumber.json", 
    	        "junit:junit.xml/cucumber.xml"},
    	plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
    	monochrome=true)
public class TestRunner {

}
