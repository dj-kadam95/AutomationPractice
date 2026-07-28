package may_01_to_13_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class A008_actionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		1. hoverOver

//		driver.get("https://www.flipkart.com/");
//		driver.get("https://www.amazon.in/");
//		WebElement e2 = driver.findElement(By.xpath("//span[.='Prime']"));
//		Actions hover = new Actions(driver);
//		hover.moveToElement(e2).perform();
		
//		driver.get("https://www.amazon.in/");
//		System.out.println(driver.getTitle());
//		WebElement e2 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions hover = new Actions(driver);
//		hover.moveToElement(e2).perform();
//		WebElement sign = driver.findElement(By.xpath("//span[.='Sign in']"));
//		sign.click();
//		System.out.println(driver.getTitle());
//		driver.quit();
		
//		2. Drag @ drop
		
//		driver.get("https://grotechminds.com/drag-and-drop/");
//		WebElement drg= driver.findElement(By.xpath("//img[@id='drag2']"));
//		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
//		WebElement drpAgain= driver.findElement(By.xpath("//div[@id='container-1']"));
//		Actions drgDrp = new Actions(driver);
//		hover.dragAndDrop(drg, drop).perform();
//		Thread.sleep(3000);
//		drgDrp.dragAndDrop(drop, drpAgain).perform();
		
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement drg= driver.findElement(By.xpath("//img[@id='drag2']"));
//		hover.doubleClick(drg).perform();
	    hover.contextClick(drg).perform();
		
		
	}

}
