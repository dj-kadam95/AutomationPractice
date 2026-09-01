package abstract_components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class URL_step2 {

	public WebDriver driver;
	
	public URL_step2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void goToURL() {
		driver.get("https://medikart.co.in/");
//		A_May_30_loginPage LP = new A_May_30_loginPage(driver);
//		return LP;
	}

}
