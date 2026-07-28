package may_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A03_search_city_dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement search1 = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		search1.click();
		
		WebElement fromCity = driver.findElement(By.xpath("(//a[@value='BLR'])[1]"));
		Thread.sleep(2000);
		fromCity.click();
		
		Thread.sleep(2000);
		WebElement toCity = driver.findElement(By.xpath("(//a[@value='MAA'])[2]"));
		Thread.sleep(2000);
	    toCity.click();
	
	}
}
