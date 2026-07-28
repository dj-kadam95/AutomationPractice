package may_15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A01_autosuggestion_rahulshetty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement search = driver.findElement(By.id("autocomplete"));
		search.sendKeys("Den");
		Thread.sleep(3000);

		List<WebElement> cont1 = driver.findElements(By.className("ui-menu-item"));

		for (int i = 0; i < cont1.size(); i++) {

			String country = cont1.get(i).getText();

			if (country.equals("Denmark")) {
				cont1.get(i).click();

			}

		}
		
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(2000);
		

	}

}
