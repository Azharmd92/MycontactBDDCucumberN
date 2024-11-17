package stepDefinitions;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resource/Features"},
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		//plugin={"pretty","html:target/CucumberReports/CucumberReport.html"}
				
	plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class parallel extends AbstractTestNGCucumberTests {
	@DataProvider(parallel=true)
	public Object[][] Scenerios(){
		
		return super.scenarios();
		
	}

}
