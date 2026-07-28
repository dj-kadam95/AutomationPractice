package feb_09_xpathAccess;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ChildToParent {

	public static void main(String[] args) {
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
		
		EdgeDriver driver = new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.className("a-button-input")).click();
		
		WebElement ab =driver.findElement(By.xpath("//option[text()='All Departments']/parent::select"));
		String catagory = ab.getText();
		System.out.println(catagory);
		ab.click();
		
	}

}
