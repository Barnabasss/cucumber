package pages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordScreen {

	
WebDriver driver = null;
	
	public PasswordScreen(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
			
	}
	
	
	@FindBy (name = "Passwd")
	WebElement password;
	
	@FindBy (xpath = "//*[@id=\"passwordNext\"]/div/button/span")
	WebElement nextButton;
	
	@FindBy (xpath = "//*[@id=\"forgotPassword\"]/div/button/span")
	WebElement forgotPassword_link;
	
	
	
	
	public void enterPassword() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password to signin");
		String pwd = sc.next();
		password.sendKeys(pwd);
		
	}
	
	
	
	public void next() {
		
		nextButton.click();
		
	}
	
	
	public void forgotPassword() {
		
		
		forgotPassword_link.click();
		
	}
	
	
	
}
