package missing_topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Right_click_not_working {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

        EdgeDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.sbi.bank.in/retail/login.htm");
        Thread.sleep(2000);
        //WebElement e1=        driver.findElement(By.className("login_button"));
       // e1.click();
        WebElement e2=        driver.findElement(By.id("mat-input-1"));
        e2.sendKeys("manish123456");
		
	}

}
