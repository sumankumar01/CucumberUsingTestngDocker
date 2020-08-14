package CucumberOptions;	

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
	 //features={"\\src\\test\\resources\\Features\\"},
				 features={"src//test//resources//Features"},
		
				 plugin = { "html:target/cucumber-html-report",
		        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
		    "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
		        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml",
		"rerun:target/rerun.txt"
		       },
			
				 tags={"@Registartion"},
		//dryRun=true,
		
		glue={"StepDefinitions"}
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	

	


}