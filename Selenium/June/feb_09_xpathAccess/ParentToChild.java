package feb_09_xpathAccess;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ParentToChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Map<String, Object> prefs = new HashMap<>();
		Map<String, Object> profile = new HashMap<>();
		Map<String, Object> contentSettings = new HashMap<>();

		// 1 = Allow, 2 = Block
		contentSettings.put("geolocation", 2);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);

		EdgeOptions options = new EdgeOptions();
		options.setExperimentalOption("prefs", prefs);

		// Launch Chrome with location allowed
		EdgeDriver driver = new EdgeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.airindia.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ai-dropdown__trigger ng-tns-c3757420357-1']")).click();
		List<WebElement> ab =driver.findElements(By.xpath("//div[@class='ai-dropdown__options ng-tns-c3757420357-1']/child::*"));
        String text = ab.get(1).getText();
        
        System.out.println(text);
        driver.findElement(By.xpath("//div[@class='ai-dropdown__options ng-tns-c3757420357-1']/child::button[2]")).click();
        driver.quit();
	}

}
