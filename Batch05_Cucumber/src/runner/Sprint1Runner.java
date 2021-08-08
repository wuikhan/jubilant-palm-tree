package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "feature", 
		glue = "stepDefinition", 
		dryRun = false, 
		monochrome = true, 
		format = { 
				"pretty",
				"html:target/cucumber-reports", 
				"json:target/json" 
				},
		tags= {"@sprint1"})
public class Sprint1Runner {

}
