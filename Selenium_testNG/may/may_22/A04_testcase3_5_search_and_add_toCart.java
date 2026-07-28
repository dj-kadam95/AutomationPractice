package may_22;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class A04_testcase3_5_search_and_add_toCart {

	WebDriver driver;

	@Test
	public void Search() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.findElement(By.className("search-keyword")).sendKeys("po");
		Thread.sleep(3000);
		String[] prods = { "Potato - 1 Kg", "Pomegranate - 1 Kg" };
		List<String> expected = Arrays.asList(prods);
		List<WebElement> products = driver.findElements(By.className("product-name"));
		int countProducts = 0;
		for (int i = 0; i < products.size(); i++) {

			try {
				String prodName = products.get(i).getText();

				if (prodName.contains("Po")) {
					countProducts++;

					Assert.assertEquals(expected.contains(prodName), true);

					driver.findElements(By.className("product-action")).get(i).click();
					Thread.sleep(3000);
				}

			} catch (StaleElementReferenceException e) {
			}
		}
		System.out.println("countProducts : " + countProducts);

		driver.findElement(By.className("cart-icon")).click();
		Thread.sleep(3000);
		List<WebElement> items = driver.findElements(By.xpath("//p[@class='product-name']"));
		System.out.println(items.size());
		String[] arrays = new String[2];

		for (int i = 0; i < 2; i++) {
			arrays[i] = items.get(i).getText();
		}
		List<String> actual = Arrays.asList(arrays);
		System.out.println(actual);
		System.out.println(expected);

		Assert.assertEquals(actual, expected);
		driver.quit();

	}
}
