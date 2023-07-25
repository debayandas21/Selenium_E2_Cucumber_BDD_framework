package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "src\\test\\resources\\Features\\GoogleSearchPage.feature",
		glue= {"stepDefs"},
		monochrome= true,
		dryRun=false,
		plugin= {"pretty",
						//"usage:target/reports/usageReport",
						//"html:target/reports/HTMLReport.html",
						//"json:target/reports/JSONReport.json",
						//"testng:target/reports/TestngReport.xml"
						//"rerun:target/reports/failedScenarios.txt"
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						}
		)


public class GooglePageRunner extends AbstractTestNGCucumberTests{
  
}
