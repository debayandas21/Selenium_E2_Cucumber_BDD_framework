package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteDef {
	
	WebDriver driver;
	@Given("User launch google page")
	public void user_launch_google_page() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
	}
	@When("user search java tutorial")
	public void user_search_java_tutorial() {
		
		WebElement searchFld= driver.findElement(By.name("q"));
		searchFld.sendKeys("Java Tutorials");
		searchFld.submit();
		
	   
	}
	@Then("should display java tutorial page")
	public void should_display_java_tutorial_page() {
	    
		Assert.assertEquals(driver.getTitle(), "Java Tutorials - Google Search");
		System.out.println("Exeuction completed and Title Matched");
		driver.close();
	}

	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement schBox= driver.findElement(By.name("q"));
		schBox.sendKeys("Selenium Tutorial");
		schBox.submit();

	}
	@Then("Should display Selenium result page")
	public void should_display_selenium_result_page() {
		Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
}
	@When("User search Cypress Tutorial")
	public void user_search_cypress_tutorial() {
		WebElement schBox= driver.findElement(By.name("q"));
		schBox.sendKeys("Cypress Tutorial");
		schBox.submit();

	}
	@Then("Should display Cypress result page")
	public void should_display_cypress_result_page() {
		Assert.assertEquals(driver.getTitle(),"Cypress Tutorial - Google Search");
	}
	@After
	public void attachScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot screen =(TakesScreenshot)driver;
			byte[] imgByte = screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(imgByte, "image/png", "ImageOne");
		}
	}
	
}
