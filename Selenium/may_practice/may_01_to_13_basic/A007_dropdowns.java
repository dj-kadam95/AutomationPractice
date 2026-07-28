package may_01_to_13_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class A007_dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		WebElement e1 =driver.findElement(By.name("url"));
		Select drpdwn = new Select(e1);
		//drpdwn.selectByVisibleText("Books");
		drpdwn.selectByIndex(7);
		//drpdwn.selectByValue("search-alias=beauty");
		
		
	}

}
