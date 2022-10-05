package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Remember {

	WebDriver driver;
	@Given("User must be on homepage url {string}")
	public void user_must_be_on_homepage_url(String string) {
	   
		System.setProperty("Webdriver.gecko.driver", "geckodriver.exe");
		   driver = new FirefoxDriver();
		   driver.get(string);
	}

	@When("User clicks on Remember Me checkbox")
	public void user_clicks_on_remember_me_checkbox() {
	driver.findElement(By.className("form-check-input")).click();;    
		
	}

	@Then("Remember Me checkbox must get selected")
	public void remember_me_checkbox_must_get_selected() {
	boolean a=driver.findElement(By.className("form-check-input")).isSelected();;
	System.out.println(a);
	}
}
