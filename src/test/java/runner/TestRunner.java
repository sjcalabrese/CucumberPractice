package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//feature file is passed here
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinition",
		stepNotifications = true,
		tags="@SeleniumTest",
		plugin= {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
				"junit:target/cucumber.xml"},
		publish=true
		)
public class TestRunner {

}
