package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import resource.NewResource;
import resource.resource;

public class Hooks extends resource{

	
//	NewResource Driver;
//	public Hooks(NewResource DriverResource) {
//		this.Driver=DriverResource;
//	}
	
	
	@Before
	public void launch() {
		System.out.println("Hiiiiiiiiiiiiiii");
		System.setProperty("webdriver.chrome.driver", "/Users/doodleblue/Downloads/chromedriver" );
		
		  driver = new ChromeDriver();
		//0driver.setDriver(driver);
		driver.get("https:www.gmail.com");
		
		
	}
	
	
	
	
}
