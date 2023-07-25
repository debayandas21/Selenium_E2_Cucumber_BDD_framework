package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//features = "target\\reports\\failedScenarios.txt",
		features = "src\\test\\resources\\Features\\Login.feature",
		glue = {"stepDefs"},
		monochrome=true
		)

public class RerunRunner extends AbstractTestNGCucumberTests {
  
}
