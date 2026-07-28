package feb_05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A02_iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/add-to-cart/");
		
		WebElement frame = driver.findElement(By.id("frame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("firstName")).sendKeys("abcdefg");
		

	}

}
