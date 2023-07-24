package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

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

}
