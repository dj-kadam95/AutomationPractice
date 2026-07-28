package June_10;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class A02_fluent_wait {
	EdgeDriver driver;

	@Test
	public void Search() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		FluentWait<EdgeDriver> w = new FluentWait<EdgeDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		WebElement id =driver.findElement(By.xpath("//input[@id='inputUsername']"));
		id.sendKeys("abcd");
		WebElement pw =driver.findElement(By.xpath("//input[@name='inputPassword']"));
		pw.sendKeys("rahulshettyacademy");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		w.until(ExpectedConditions.visibilityOf(login));
		login.click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("p")));
		WebElement text= driver.findElement(By.xpath("//div/p"));
		System.out.println(text.getText());
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("logout-btn")));
		WebElement logout = driver.findElement(By.xpath("//button[@class='logout-btn']"));
		logout.click();
	}
}
