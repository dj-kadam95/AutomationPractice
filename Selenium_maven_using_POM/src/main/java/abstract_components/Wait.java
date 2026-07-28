package abstract_components;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	WebDriver driver;
	
	public Wait(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void waitForWebElementToAppear1( List<WebElement> findby){

		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NullPointerException.class);

		w.until(ExpectedConditions.visibilityOfAllElements(findby));

	}

	public void waitForWebElementToAppear(By prods){

		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NullPointerException.class);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(prods));

	}

}
