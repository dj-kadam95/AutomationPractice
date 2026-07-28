package may_01_to_13_basic;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A012_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
//		driver.get("https://www.facebook.com/login.php/");
//		
//	//	1. Color of the component
//		
//		WebElement login= driver.findElement(By.id("loginbutton"));
//		System.out.println(login.getCssValue("background-color"));
//		
//	//	2. dimensions of the component
//		
//		Dimension d= login.getSize();
//		
//		int length = d.getWidth();
//		int height =  d.getHeight();
//		
//		System.out.println("width = "+length+ " & "+"height = "+height);
		
		driver.get("https://www.amazon.in/");
		WebElement about = driver.findElement(By.xpath("//a[@class='nav_a'][1]"));
		Point p1 = about.getLocation();
		
		int x= p1.getX();
		int y= p1.getY();	
		int y1=y-100;
		int y2=y+50;
		
		System.out.println("x : "+x+ " & "+"y : "+y);
		
	//  3. ScrollDown
		
		JavascriptExecutor js = driver;
		
		js.executeScript("window.scrollBy(0,"+y1+")");
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0,"+ -y2+")");
		
	}

}
