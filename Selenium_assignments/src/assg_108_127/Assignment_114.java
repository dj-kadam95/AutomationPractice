package assg_108_127;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_114 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WAP to launching https://www.google.com/ and 
//		typing something in search box of it using class name locator

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.className("gLFyf"));
		search.sendKeys("instagram");
		search.sendKeys(Keys.ENTER);

	}

}
