package may_15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02_autosuggestive_on_site {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		WebElement search = driver.findElement(By.className("ui-autocomplete-input"));
//		search.sendKeys("ind");
//		Thread.sleep(3000);
//		List<WebElement> options = driver.findElements(By.xpath("//ul[@class]/li"));
//		for(int i=0; i<options.size(); i++) {
//			//String s=options.get(i).getText();
//			System.out.println(options.get(i).getText());
//			if(options.get(i).getText().equals("India")) {
//				options.get(i).click();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.className("gLFyf"));
		search.sendKeys("yop");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class]/ul/li"));
		for(int i=0; i<options.size(); i++) {
			String s=options.get(i).getText();
			System.out.println(options.get(i).getText());
			if(s.equals("yono games")) {
				System.out.println(s);
				options.get(i).click();
				break;
			}
		}	
	}

}
