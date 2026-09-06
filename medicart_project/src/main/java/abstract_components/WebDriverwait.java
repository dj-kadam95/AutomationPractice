package abstract_components;

import java.time.Duration;

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

	    public void waitForElement(WebElement locator) {
	        WebDriverWait wait =
	            new WebDriverWait(driver, Duration.ofSeconds(60));

	        wait.until(ExpectedConditions.visibilityOf(locator));
	    }
	}


