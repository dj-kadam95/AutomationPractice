package may_20;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class A04_timeout {
	
	@Test(timeOut=1000)
	public void brouwserLaunch() {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
	}
}
