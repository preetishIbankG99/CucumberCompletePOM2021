package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "Features/SearchUser.feature",glue="stepDefinition",
		plugin={"html:target/cucumber-html-report",
				"json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json",
				"junit:target/cucumber-results.xml",
//			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
				
		strict=true,
		monochrome=true,
		dryRun=false
		
		)

public class UserSearchRunner {

}
