package may_01_to_13_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A013_JSpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://grotechminds.com/javascript-popup/");
//		WebElement popup = driver.findElement(By.xpath("//button[@class='btnjs']"));
//		popup.click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
		
		driver.get("https://grotechminds.com/alert/");
		driver.manage().window().maximize();
		WebElement popup = driver.findElement(By.xpath("//button[@class='bbb']"));
    	popup.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		popup.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
	}

}
