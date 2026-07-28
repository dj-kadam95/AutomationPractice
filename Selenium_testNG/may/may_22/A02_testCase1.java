package may_22;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A02_testCase1 {
	
     @Test
	public void main() {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		String expected = driver.getTitle();
		String actual = "Google";
		
		Assert.assertEquals(actual, expected);
		driver.quit();
		

	}
}

