package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resource/Features/Login.feature"},
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		//plugin={"pretty","html:target/CucumberReports/CucumberReport.html"}
				
	plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class TestRun {

}
