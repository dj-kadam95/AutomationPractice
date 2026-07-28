package feb_06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		WebElement nine_dots =driver.findElement(By.cssSelector("a.gb_C"));
		nine_dots.click();
		
		WebElement frame = driver.findElement(By.name("app"));
		driver.switchTo().frame(frame);
		
		WebElement input = driver.findElement(By.xpath("//li[@class='j1ei8c'][3]"));
		input.click();
		System.out.println(driver.getTitle());
		
//		Thread.sleep(3000);
//		
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//div[@class='KNfEk Rqu0ae aUjao'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='lSDxNd'][1]")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='w5hRs'][1]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
