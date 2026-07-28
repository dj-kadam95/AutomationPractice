package may_01_to_13_basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class A012_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement about = driver.findElement(By.xpath("//a[@class='nav_a'][1]"));
		Point p1 = about.getLocation();
		
		int x= p1.getX();
		int y= p1.getY();	
		int y1=y-200;
		int y2=y+50;
		
		System.out.println("x : "+x+ " & "+"y : "+y);
		
	//  3. ScrollDown
		
		JavascriptExecutor js = driver;
		
		js.executeScript("window.scrollBy(0,"+y1+")");
		//Thread.sleep(3000);
		
		TakesScreenshot ts = driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\shubh\\Pictures\\Screenshots\\about.jpg");
		FileHandler.copy(src, destn);
		
		//Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,"+ -y2+")");
		
		//Thread.sleep(2000);
		
		TakesScreenshot ts1 = driver;  //-------1
		File src1 = ts1.getScreenshotAs(OutputType.FILE); //------2
		File destn1=new File("C:\\Users\\shubh\\Pictures\\Screenshots\\home.jpg");
		//------------3
		FileHandler.copy(src1, destn1); //----------4

	}

}
