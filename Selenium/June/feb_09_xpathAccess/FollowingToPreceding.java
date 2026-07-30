package feb_09_xpathAccess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FollowingToPreceding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.className("a-button-input")).click();
//	
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/preceding-sibling::label[1]"));
		search.sendKeys("Moto");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
