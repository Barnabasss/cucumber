package functions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmailScreen;
import resource.NewResource;
import resource.resource;

public class ExecuteLogin extends resource {
	
	

	
	
	EmailScreen emai = new EmailScreen(driver);

@Given("Open the gmail page")
public void openTheGmailPage() {
    System.out.println("The page should be opened");
}

	
	
	
	@And("Enter Valid Email")
	public void enterEmail() {
		
		emai.validEmail();
		
		
	}
	
	@When("Select Next in Email Screen")
	public void selectNext() {
		
		emai.selectNext();
		
	}
	
	@Then("The password screen will be displayed")
	public void executeThen() {
		System.out.println("mudinjichu da");
		driver.quit();
	}
	
	
	@And("Enter invalid email {string}")
	public void enter(String string) {
	  
		emai.invalidEmail(string);
	}
	@Then("Error message should be displayed")
	public void errorMessageShouldBeDisplayed() {
		
		System.out.println("Error message displayed");
		emai.verifyError();
		
	}

}
