package assg_108_127;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_111 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		WAP to find login button component on https://www.facebook.com/  
//		page by using name locator and perform click action on it
		
     	ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement login =driver.findElement(By.name("login"));
		login.click();
        driver.quit();
	
	}

}
