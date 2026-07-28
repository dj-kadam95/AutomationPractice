package may_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A014_file_upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement choose = driver.findElement(By.xpath("//input[@id='file']"));
		choose.sendKeys("C:\\Users\\shubh\\Pictures\\Java Assignment\\Assignment_002.jpg");

	}

}
