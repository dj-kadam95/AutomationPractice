package may_14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A01_autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement search =driver.findElement(By.id("APjFqb"));
		search.sendKeys("bang");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.cssSelector(".sbct"));
		
		for (int i =0; i<list.size(); i++) {
			
			String name = list.get(i).getText();
			
			if(name.contains("lore")) {
				String name1 = list.get(i).getText();
				System.out.println(name1);
			}
		}

	}

}
