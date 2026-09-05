package abstract_components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom.Registration;

public class URL_step2 {

	public WebDriver driver;
	
	public URL_step2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public Registration goToURL() {
		driver.get("https://medikart.co.in/");
		Registration LP = new Registration(driver);
		return LP;
	}

}
