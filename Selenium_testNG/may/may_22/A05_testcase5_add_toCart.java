package may_22;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class A05_testcase5_add_toCart {

	WebDriver driver;

	@Test
	public void Search() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/client/#/auth/login");

		driver.findElement(By.id("userEmail")).sendKeys("dkdhananjay77@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Shubh@15061995");
		driver.findElement(By.id("login")).click();

		Thread.sleep(3000);
		String[] prods = { "ZARA COAT 3", "ADIDAS ORIGINAL", "IPHONE 13 PRO" };
		List<String> expected = Arrays.asList(prods);
		List<WebElement> products = driver.findElements(By.tagName("h5"));
		int countProducts = 0;
		for (int i = 0; i < products.size(); i++) {

			String prodName = products.get(i).getText();
			if (prodName.contains("3")) {
				countProducts++;
				System.out.println(prodName);

				Assert.assertEquals(expected.contains(prodName), true);

				driver.findElements(By.className("w-10")).get(i).click();
				Thread.sleep(2000);
				String actual =driver.findElement(By.className("toast-message")).getText();
				String Expected = "Product Added To Cart";
				
				System.out.println(actual);
				
				Assert.assertEquals(actual, Expected, "True............");
				
			}

		}
		System.out.println("countProducts : " + countProducts);

		driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
		Thread.sleep(3000);
		List<WebElement> items = driver.findElements(By.xpath("//li//div/h3"));
		System.out.println(items.size());
		String[] arrays = new String[3];

		for (int i = 0; i <items.size(); i++) {
			arrays[i] = items.get(i).getText();
		}
		List<String> actual = Arrays.asList(arrays);
		System.out.println(actual);
		System.out.println(expected);

		Assert.assertEquals(actual, expected);
		driver.quit();

	}
}
