package may_29;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class A02_typing_on_compenent_without_sendkeys_using_JSE {
public WebDriver driver;
	
	@Test
	public void broken_links() throws IOException {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	WebElement mail =	driver.findElement(By.id("userEmail"));
	WebElement pw =	driver.findElement(By.id("userPassword"));
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].value='dkdhananjay77@gmail.com'", mail);
	js.executeScript("arguments[0].value='Shubh@15061995'", pw);
	}

}
