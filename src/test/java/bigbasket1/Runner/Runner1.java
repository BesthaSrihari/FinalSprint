package bigbasket1.Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(
		Cucumber.class)
@CucumberOptions(
		
		features = "./Feature1/bigbasket1.feature",
		glue = "Steps",
		monochrome = true,
		plugin= {"pretty","html:test-output"}
		)
public class Runner1 {

}
