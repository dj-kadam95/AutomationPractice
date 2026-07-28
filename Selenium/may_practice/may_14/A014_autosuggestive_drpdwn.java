package may_14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A014_autosuggestive_drpdwn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.className("a-button-text")).click();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mp");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='two-pane-results-container']"));
		for(int i=0; i<options.size(); i++) {
			String s=options.get(i).getText();
			System.out.println(s);
			options.get(3).click();
//			if(s.equals("mp3 player with sd card")) {
//				System.out.println(s);
//				System.out.println(options.get(i).getText());
//				break;
//			}
		}	
	}

}
