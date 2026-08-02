package missing_topics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximized {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 ChromeOptions options=new ChromeOptions();
         options.addArguments("start-maximized");
         ChromeDriver driver=new ChromeDriver(options);
         Thread.sleep(3000);
 
         driver.manage().window().maximize();
         driver.get("https://www.amazon.in/");
         driver.navigate().refresh();
         Thread.sleep(1000);
         WebElement e1=        driver.findElement(By.id("searchDropdownBox"));
         e1.click();
         e1.sendKeys(Keys.ARROW_DOWN);
         Thread.sleep(1000);
         e1.sendKeys(Keys.ARROW_DOWN);
         Thread.sleep(1000);

         e1.sendKeys(Keys.ENTER);

	}

}
