package assg_108_127;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_119 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WAP to perform item search using relative Xpath for both facebook and amazon

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Motorola");
		search.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());

	}

}

