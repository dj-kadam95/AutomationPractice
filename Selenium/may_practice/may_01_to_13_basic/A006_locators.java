package may_01_to_13_basic;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class A006_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		1. WAP on clicking gmail link in google page
		
//		driver.get("https://www.google.com/");
//		WebElement gmail = driver.findElement(By.linkText("Gmail"));
//		gmail.click();
//		System.out.println(driver.getTitle());
		
//		2. tag name
		
//		WebElement tags= driver.findElement(By.tagName("textarea"));
//		tags.sendKeys("bislery");
		
//		3. partialLinkText
		
//		WebElement gmail = driver.findElement(By.partialLinkText("Gma"));
//    	gmail.click();
//		System.out.println(driver.getTitle());
		
//		4. WAP on typing in flipcart search & pressing enter button
		
//		driver.get("https://www.flipkart.com/");
//		WebElement search= driver.findElement(By.className("Pke_EE"));
//		search.sendKeys("bislery" + Keys.ENTER);
		
//		5. WAP on typing first name & pasting it into surname using Keys
		
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		WebElement name = driver.findElement(By.name("name"));
//		name.sendKeys("dkdhananjay77@gmail.com");
//		name.sendKeys(Keys.CONTROL+"A"+"c"+Keys.BACK_SPACE);
//		name.sendKeys("Dhananjay Kadam");
//		WebElement mail = driver.findElement(By.name("email"));
//		mail.sendKeys(Keys.CONTROL+"v");
		
//		6. WAP on absolute X-path
		
//		driver.get("https://www.flipkart.com/");
//		WebElement login = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/header/div/div/div/div/div/div/a/span[1]"));
//		login.click();
//		System.out.println(driver.getTitle());
//		driver.quit();
		
//		7. Absolute xpath assignment 
		
		driver.get("https://grotechminds.com/registeration-form/");
		WebElement Fname = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/input[1]"));
		WebElement Lname = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/input[2]"));
		WebElement email = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/input[3]"));
		WebElement mobNo = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/input[4]"));
		WebElement gender_dropdown = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/select[1]"));
		WebElement state_dropdown = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/select[2]"));
		WebElement aadhar = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/input[5]"));
		WebElement pan = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/input[6]"));
		WebElement ChBox = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/input[7]"));
		WebElement submit = driver.findElement(By.xpath("//button[@name='Submit']"));//("/html/body/div/div/div/div/div/div/div/div/form/button[1]"));
		
//		id("c_bs_1"));//
//		("//input[@id='c_bs_1']"));//
		
		Fname.sendKeys("Dhananjay");
		Lname.sendKeys("Kadam");
		email.sendKeys("dkdhananjay@gmail.com");
		mobNo.sendKeys("8237413999");
		Select gender = new Select(gender_dropdown);
		gender.selectByVisibleText("Male");
		Select state =new Select(state_dropdown);
		state.selectByVisibleText("Maharashtra");
		aadhar.sendKeys("866562876212");
		pan.sendKeys("HIWPK8887B");
		Thread.sleep(3000);
		System.out.println(ChBox.isSelected());
		ChBox.click();
		System.out.println(ChBox.isSelected());
		Thread.sleep(2000);
		submit.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.quit();
		
		
		

	}

}
