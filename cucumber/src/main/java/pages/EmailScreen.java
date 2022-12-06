package pages;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class EmailScreen {

	
WebDriver driver = null;
	
	public EmailScreen(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
			
	}
	
	@FindBy (id = "identifierId")
	WebElement email_field;
	
	
	@FindBy (xpath = "//*[@id=\"identifierNext\"]/div/button/span")
	WebElement submit_email;
	

	
	@FindBy (xpath = "//*[@id=\"login_form\"]/span/a")
	WebElement forgotPassword_field;
	
	@FindBy (xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")
	WebElement createAccount;
	
	@FindBy (xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[2]")
	WebElement personal;
	
	@FindBy (xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[2]/span[2]")
	WebElement child;
	
	@FindBy (xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[3]/span[2]")
	WebElement business;
		
	
	public void validEmail() {
		
		email_field.sendKeys("barnabas@doodle-blue.com");
		
		
	}
	
	public void selectNext() {
		
		submit_email.click();
	}
	
	public void invalidEmail(String email) {
		
		email_field.sendKeys(email);
		submit_email.click();
		
		
	}
	
	
		
	public void clickForgotPassword() {
		
		forgotPassword_field.click();
		
	}
	
	public void verifyError() {
		
		
		String abc = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText();
		Assert.assertEquals(abc, "Enter a valid email or phone number");
	}
	
	public void createAccount() {
		
		
		createAccount.click();
		System.out.println("Select the type of Account :"+"/n"+"1.Personal"+"/n"+"2.Child"+"/n"+"3.Business");
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		
		
		if (type.equals("Personal")) {
			
			personal.click();
		}else if(type.equals("Child")) {
			
			child.click();
		}else if(type.equals("Business")) {
			
			business.click();
		}
		else
			
		{
			System.out.println("nee pannudhu thapu da maiyuru");
			
		}
		
	}

}
