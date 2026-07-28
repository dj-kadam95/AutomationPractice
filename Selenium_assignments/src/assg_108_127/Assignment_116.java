package assg_108_127;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_116 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		WAP to find the below elements from https://www.google.com/ 
//		page(About, Store, Gmail and Images ) links using
//		partial linktext locator and perform click action on each of them
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		WebElement about = driver.findElement(By.partialLinkText("bout"));
		System.out.println(about.getText());
		about.click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement store = driver.findElement(By.partialLinkText("Sto"));
		System.out.println(store.getText());
		store.click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement mail = driver.findElement(By.partialLinkText("Gma"));
		System.out.println(mail.getText());
		mail.click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement img = driver.findElement(By.partialLinkText("mage"));
		System.out.println(img.getText());
		img.click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
	
		

	}

}
