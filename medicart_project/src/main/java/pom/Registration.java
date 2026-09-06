package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import abstract_components.WebDriverwait;

public class Registration extends WebDriverwait  {
	
	WebDriver driver;

	public Registration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='t4s-pr'])[2]")
	WebElement login;
	
	@FindBy(xpath="//form[@id='customer_loginlogin-sidebar']/child::p/a[text()='Create your account']")
	WebElement CreateAc;
	
	@FindBy(xpath="//div[@class='t4s_field t4s-pr ']/child::input")
	WebElement firstName;
	
	@FindBy(css="#RegisterForm-LastName")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='RegisterForm-email']")
	WebElement mail;
	
	@FindBy(xpath="//input[@id='RegisterForm-password']") //button[text()='Register']
	WebElement pw;
	
	@FindBy(xpath="//button[text()='Register']") //div[text()='Skip']
	WebElement registerBtn;
	
//	@FindBy(xpath="//a[text()='India’s trustworthy online store for healthcare products']")
//	WebElement text;
	
	@FindBy(tagName="a")
	WebElement text;
	
	@FindBy(xpath="(//button[@class='t4s-drawer__close'])[2]")
	WebElement skipBtn;
	
	public void loginBtn() {
		login.click();
	}
	
	public void createAcBtn() {
		CreateAc.click();
	}
	
	public void register(String name, String lname, String id, String PW) {
		
		firstName.sendKeys(name);
		lastName.sendKeys(lname);
		mail.sendKeys(id);
		pw.sendKeys(PW);
		registerBtn.click();
		
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
