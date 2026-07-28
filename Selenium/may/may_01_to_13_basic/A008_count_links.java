package may_01_to_13_basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A008_count_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		1. count number of links on page
		
		//driver.navigate().to("https://www.amazon.in/");
		driver.get("https://www.google.com/");
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		System.out.println(linkCount.size());
		
//		2. print all links'
		
		for(int i=0; i<linkCount.size(); i++){
			
			System.out.println(linkCount.get(i).getDomAttribute("href")+" "+i);
			System.out.println(linkCount.get(i).getText()+" "+i);	
		}
		//List<WebElement> links = driver.findElements(By.tagName("href"));
		

	}

}
