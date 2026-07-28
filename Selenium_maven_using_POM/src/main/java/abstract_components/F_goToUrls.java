package abstract_components;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom.A_May_30_loginPage;
import pom.D_June_02_add_to_cart;

public class F_goToUrls {
	
	WebDriver driver;

	public F_goToUrls(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public A_May_30_loginPage login() {
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		A_May_30_loginPage LP = new A_May_30_loginPage(driver);
		return LP;
	}
	
	public D_June_02_add_to_cart cart() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		D_June_02_add_to_cart ab = new D_June_02_add_to_cart(driver);
		return ab;
	}

}
