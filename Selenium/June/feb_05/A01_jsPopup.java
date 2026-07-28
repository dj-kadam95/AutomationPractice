package feb_05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class A01_jsPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/javascript-popup/");
		
		driver.findElement(By.xpath("//button[@class='btnjs']")).click();
		
		String a = driver.switchTo().alert().getText();
		System.out.println(a);
		driver.switchTo().alert().dismiss();

		driver.quit();
	}

}
