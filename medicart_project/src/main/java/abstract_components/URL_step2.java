package abstract_components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom.A_registration;

public class URL_step2 {

	public WebDriver driver;

	public URL_step2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public A_registration goToURL() {
		driver.get("https://medikart.co.in/");
		A_registration LP = new A_registration(driver);
		return LP;
	}
}
