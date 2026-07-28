package assg_108_127;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_112 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//   		WAP to perform login on https://www.facebook.com/ 
//			with correct credentials using x path locator
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement id = driver.findElement(By.xpath("//input[@id='email']"));//.sendKeys("dkdhananjay77@gmail.com");;
			id.sendKeys("dkdhananjay77@gmail.com");
			WebElement pw =driver.findElement(By.xpath("//input[@id='pass']"));
			pw.sendKeys("Shubh@15061995");
			WebElement login =driver.findElement(By.xpath("//button[@name='login']"));
			login.click();
			Thread.sleep(5000);
		    System.out.println(driver.getTitle());
		    driver.quit();
		    
	}

}
