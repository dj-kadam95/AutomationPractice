package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="CustomerEmail")
	WebElement mail;
	
	@FindBy(id="CustomerPassword")
	WebElement pw;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement loginBtn;
	
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(text));
		String actualText=driver.findElement(By.tagName("a")).getText();
		return actualText;
		
	}
	
public void skipBtn() {
		
		skipBtn.click();
		
	}
}
