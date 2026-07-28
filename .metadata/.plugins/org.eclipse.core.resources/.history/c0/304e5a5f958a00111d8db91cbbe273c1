package may_01_to_13_basic;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

public class A008_navigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		

	}

}
