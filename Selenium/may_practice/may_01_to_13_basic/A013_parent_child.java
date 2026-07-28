package may_01_to_13_basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A013_parent_child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
        driver.manage().window().maximize();
		WebElement google=driver.findElement(By.xpath("//span[.='Google']"));
        google.click();
        Set<String> ids= driver.getWindowHandles();
        System.out.println(ids);
       
       Iterator<String> id = ids.iterator();
       String parent =id.next();
       String child = id.next();
       
       System.out.println(parent);
       System.out.println(child);
       
       WebDriver ch = driver.switchTo().window(child);
       WebElement create =  ch.findElement(By.xpath("//span[.='Create account']"));
       create.click();
       System.out.println(ch.getTitle());
       ch.close();
       ch.switchTo().window(parent);
       google.click();
        
	}

}
