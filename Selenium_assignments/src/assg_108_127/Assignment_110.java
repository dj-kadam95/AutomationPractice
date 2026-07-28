package assg_108_127;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WAP to find all the components one by one 
//		from https://www.facebook.com/ page by using id locator 
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("rdhgfxhgdhg");
		System.out.println(mail.getAttribute("placeholder"));
		WebElement pw = driver.findElement(By.id("pass"));
		System.out.println(pw.getAttribute("placeholder"));
    	WebElement login = driver.findElement(By.id("u_0_5"));
		System.out.println(login.getText());

	}

}
