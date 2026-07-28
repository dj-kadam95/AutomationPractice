package may_26;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.Assert;

public class A01_checkout_cod {

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
		String[] prods = { "ZARA COAT 3", "IPHONE 13 PRO" };
		List<String> expected = Arrays.asList(prods);
		List<WebElement> products = driver.findElements(By.tagName("h5"));
		int countProducts = 0;
		for (int i = 0; i < products.size(); i++) {

			String prodName = products.get(i).getText();
			if (prodName.contains("3")) {
				countProducts++;

				Assert.assertEquals(expected.contains(prodName), true);

				driver.findElements(By.className("w-10")).get(i).click();
				Thread.sleep(2000);
				String actual =driver.findElement(By.className("toast-message")).getText();
				String Expected = "Product Added To Cart";
				
				Assert.assertEquals(actual, Expected, "True............");
			}
		}
		System.out.println("countProducts : " + countProducts);

		driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
		Thread.sleep(3000);
		List<WebElement> items = driver.findElements(By.xpath("//li//div/h3"));
		System.out.println(items.size());
		String[] arrays = new String[2];

		for (int i = 0; i <items.size(); i++) {
			arrays[i] = items.get(i).getText();
		}
		List<String> actual = Arrays.asList(arrays);
		System.out.println(actual);
		System.out.println(expected);

		Assert.assertEquals(expected.equals(actual), true);
	
		Thread.sleep(7000);
		//driver.findElement(By.xpath("(//div/ul/li/button)[1]")).click();
		WebElement month =driver.findElement(By.xpath("(//div/select)[1]"));
		WebElement year =driver.findElement(By.xpath("(//div/select)[2]"));
		
		Select select1 = new Select(month);
		select1.selectByVisibleText("07");
		Thread.sleep(1500);
		Select select2 = new Select(year);
		select2.selectByVisibleText("29");
		Thread.sleep(1500);
		
		WebElement csv =driver.findElement(By.xpath("(//div/input)[2]"));
		csv.sendKeys("345");
		Thread.sleep(1500);
		WebElement name =driver.findElement(By.xpath("(//div/input)[3]"));
		name.sendKeys("Dhananjay");
		Thread.sleep(1500);
		
		WebElement Country =driver.findElement(By.xpath("(//div/input)[6]"));
		Country.sendKeys("Ind");
		
//		List<WebElement> con = driver.findElements(By.className("button.ta-item.list-group-item.ng-star-inserted"));
//		System.out.println(con.size());
//		for(int i=0; i<con.size(); i++) {
//			String ab =con.get(i).getText();
//			System.out.println(ab);
//			if(ab.equals("India")) {
//				Thread.sleep(2000);
//				con.get(i).click();
//			}
//		}
		
		Thread.sleep(5000);
		WebElement place =driver.findElement(By.cssSelector(".action__submit"));
		place.click();
		
		Thread.sleep(5000);
		
		String thank_you = driver.findElement(By.cssSelector("h1.hero-primary")).getText();
		String expected2 = "THANKYOU FOR THE ORDER.";
		
		Assert.assertEquals(thank_you, expected2);
	}
}
