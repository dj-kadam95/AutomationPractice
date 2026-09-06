package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import abstract_components.WebDriverwait;


public class Login extends WebDriverwait {

	WebDriver driver;
	
	public Login(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="CustomerEmail")
	WebElement mail;
	
	@FindBy(id="CustomerPassword")
	WebElement pw;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement loginBtn;
	
//	@FindBy(xpath="//a[text()='Return to the previous page.']")
//	WebElement text;
	
	@FindBy(tagName="a")
	WebElement text;
	
	@FindBy(xpath="(//button[@class='t4s-drawer__close'])[2]")
	WebElement skipBtn;
	
	public void login(String id, String PW) {
		mail.sendKeys(id);
		pw.sendKeys(PW);
		loginBtn.click();
	}
	
	public String waitForElement() {
		
		waitForElement(text);
		String actualText=driver.findElement(By.tagName("a")).getText();
		return actualText;
		
	}
	
public void skipBtn() {
		
		skipBtn.click();
		
	}
}
