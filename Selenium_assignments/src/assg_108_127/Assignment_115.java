package assg_108_127;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_115 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		WAP to find the below elements from https://www.google.com/  
//		page(About, Store, Gmail and Images ) links using linktext locator
//		and perform click action on each of them
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		WebElement about = driver.findElement(By.linkText("About"));
		System.out.println(about.getText());
		about.click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement store = driver.findElement(By.linkText("Store"));
		System.out.println(store.getText());
		store.click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement mail = driver.findElement(By.linkText("Gmail"));
		System.out.println(mail.getText());
		mail.click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement img = driver.findElement(By.linkText("Images"));
		System.out.println(img.getText());
		img.click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		

	}

}
