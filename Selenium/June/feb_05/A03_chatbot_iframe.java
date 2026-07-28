package feb_05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A03_chatbot_iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/");
		
		
		WebElement chatbot =driver.findElement(By.xpath("//div[@id='chat-bot-launcher-button']"));
		chatbot.click();
		
		WebElement frame = driver.findElement(By.id("chat-bot-iframe"));
		driver.switchTo().frame(frame);
		
		WebElement input = driver.findElement(By.id("textInput"));
		input.sendKeys("abcdefg");
		input.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		chatbot.click();
		
		Thread.sleep(3000);
		
		WebElement ab =driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-764468'][1]"));
		
		ab.click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
	}

}
