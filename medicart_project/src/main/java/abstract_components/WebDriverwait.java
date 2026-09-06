package abstract_components;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverwait {
	

	    WebDriver driver;

	    public WebDriverwait(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(tagName="a")
		WebElement text;
	    
	    @FindBy(tagName="//input[@class='t4s-search-header__input t4s-input__currentcolor'] ")
		WebElement searchBox;

	    public void waitForElement(WebElement locator) {
	        WebDriverWait wait =
	            new WebDriverWait(driver, Duration.ofSeconds(10));

	        wait.until(ExpectedConditions.visibilityOf(locator));
	    }
	    public void waitForElementToBeClickable(WebElement locator) {
	        WebDriverWait wait =
	            new WebDriverWait(driver, Duration.ofSeconds(15));

	        wait.until(ExpectedConditions.elementToBeClickable(locator));
	    }
	    
	    public void waitForAtLeastOneElement(By locator) {

	        WebDriverWait wait =
	                new WebDriverWait(driver, Duration.ofSeconds(30));

	        wait.until(driver -> {

	            List<WebElement> elements =
	                    driver.findElements(locator);

	            for (WebElement element : elements) {

	                if (element.isDisplayed()) {
	                    return true;
	                }
	            }

	            return false;
	        });
	    }
	}


