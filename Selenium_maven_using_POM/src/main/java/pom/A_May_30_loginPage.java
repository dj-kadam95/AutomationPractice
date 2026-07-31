package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_May_30_loginPage {
	
	WebDriver driver;

	public A_May_30_loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="userEmail")
	WebElement id;
	
	@FindBy(id="userPassword")
	WebElement pw;
	
	@FindBy(id="login")
	WebElement click;
	
	@FindBy(css="i.fa.fa-sign-out")
	WebElement logout;
	
	@FindBy(className="toast-container")
	WebElement actual;
	
	public void login(String ab, String cd) {
		
	id.sendKeys(ab);
	pw.sendKeys(cd);
	click.click();
		
	}
	public void logout() {
		logout.click();
	}
	
	public String actualMsg() {
		String msg = actual.getText();
		return msg;
	}
	
	@FindBy(tagName="h5")
	List<WebElement> prods;
	
	@FindBy(className="btn-w-10-rounded")
	List<WebElement> button;
	

	
}
