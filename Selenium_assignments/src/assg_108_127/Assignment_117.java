package assg_108_127;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_117 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WAP to search product on amazon and press enter button after searching

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.tagName("input#twotabsearchtextbox"));
		search.sendKeys("Motorola");
		search.sendKeys(Keys.ENTER);

	}

}
