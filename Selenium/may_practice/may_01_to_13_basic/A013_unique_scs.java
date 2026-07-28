package may_01_to_13_basic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class A013_unique_scs {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement about = driver.findElement(By.xpath("//a[@class='nav_a'][1]"));
		Point p1 = about.getLocation();

		int x = p1.getX();
		int y = p1.getY();
		int y1 = y - 200;
		int y2 = y + 10;
		int y3 = y + 500;

		System.out.println("x : " + x + " & " + "y : " + y);

		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy(0," + y1 + ")");
		Thread.sleep(3000);

//		1. using math.random

		TakesScreenshot sc = driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\shubh\\Pictures\\Screenshots\\" + Math.random() + ".png");
		FileHandler.copy(src, Dest);

		js.executeScript("window.scrollBy(0," + -y2 + ")");
		Thread.sleep(3000);

//		2. using class name

		TakesScreenshot sc1 = driver;
		File src1 = sc1.getScreenshotAs(OutputType.FILE);
		File Dest1 = new File("C:\\Users\\shubh\\Pictures\\Screenshots\\" + new A013_unique_scs().getClass() + ".png");
		FileHandler.copy(src1, Dest1);
//		
//		3. using Date class

		Date d1 = new Date();

		String f1 = d1.toString();
		System.out.println(f1);

		String dt = f1.substring(8, 10);
		String mon = f1.substring(4, 7);
		String yr = f1.substring(24, 28);
		String hr = f1.substring(11, 13);
		String min = f1.substring(14, 16);
		String sec = f1.substring(17, 19);

		String fullDate = dt.concat(" " + mon).concat(" " + yr).concat(" " + hr).concat(" " + min).concat(" " + sec);
		System.out.println(fullDate);

		js.executeScript("window.scrollBy(0," + -y3 + ")");
//			
//		2. using class name

		TakesScreenshot sc2 = driver;
		File src2 = sc2.getScreenshotAs(OutputType.FILE);
		File Dest2 = new File("C:\\Users\\shubh\\Pictures\\Screenshots\\" + new A013_unique_scs().getClass()+" "+fullDate + ".png");
		FileHandler.copy(src2, Dest2);

	}

}
