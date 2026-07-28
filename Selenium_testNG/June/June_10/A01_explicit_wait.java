package June_10;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class A01_explicit_wait {
	WebDriver driver;

	@Test
	public void Search() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));


		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		WebElement id =driver.findElement(By.xpath("//input[@id='inputUsername']"));
		id.sendKeys("abcd");
		WebElement pw =driver.findElement(By.xpath("//input[@name='inputPassword']"));
		pw.sendKeys("rahulshettyacademy");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement text= driver.findElement(By.xpath("//div[@class='login-container']"));
	//	w.until(ExpectedConditions.textToBePresentInElement(text, "LOG OUT"));
		System.out.println(text.getText());
		WebElement logout = driver.findElement(By.xpath("//button[@class='logout-btn']"));
		w.until(ExpectedConditions.visibilityOf(logout));
		logout.click();
	}
}
