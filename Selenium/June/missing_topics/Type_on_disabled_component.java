package missing_topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Type_on_disabled_component {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 EdgeDriver driver=new EdgeDriver();
         driver.manage().window().maximize();
         driver.get("file:///C:/Users/MKT/Desktop/learningHTML1.html");
         WebElement e1=        driver.findElement(By.id("121"));
         Thread.sleep(3000);
         
         JavascriptExecutor js=       (JavascriptExecutor) driver;
         js.executeScript("arguments[0].removeAttribute('disabled')", e1);
         Thread.sleep(3000);

         e1.sendKeys("Tiwari");


	}

}
