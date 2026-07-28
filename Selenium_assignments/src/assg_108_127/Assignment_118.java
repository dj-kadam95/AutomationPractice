package assg_108_127;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_118 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		WAP on Absolute X path on every component present in JSAM file
		
		EdgeDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("file:///C:/Users/shubh/Downloads/learningHTML1.html");
		WebElement Uname = driver.findElement(By.xpath("//html//body//input[1]"));
		WebElement hint = driver.findElement(By.xpath("//html//body//input[2]"));
		WebElement pwd = driver.findElement(By.xpath("//html//body//input[3]"));
		WebElement fname = driver.findElement(By.xpath("//html//body//form[1]//input[1]"));
		WebElement submit1 = driver.findElement(By.xpath("//html//body//form[1]//input[3]"));
	
		Uname.sendKeys("dkdhananjay77");
		hint.sendKeys("mail");
		pwd.sendKeys("1234567@");
		fname.sendKeys("Dhananjay");
		submit1.click();
		System.out.println("submit_1 "+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement ChBox1 = driver.findElement(By.xpath("//html//body//form[2]//input[1]"));
		System.out.println(ChBox1.isSelected()+"\ncheckbox not clicked\n");
		driver.findElement(By.xpath("//html//body//form[2]//input")).click();
		System.out.println(ChBox1.isSelected()+"\ncheckbox clicked\n");
		
		WebElement ChBox2 = driver.findElement(By.xpath("//html//body//form[2]//input[2]"));
		System.out.println(ChBox2.isSelected()+"\ncheckbox not clicked\n");
		driver.findElement(By.xpath("//html//body//form[2]//input[2]")).click();
		System.out.println(ChBox2.isSelected()+"\ncheckbox clicked\n");
		
		WebElement ChBox3 = driver.findElement(By.xpath("//html//body//form[2]//input[3]"));
		System.out.println(ChBox3.isSelected()+"\ncheckbox not clicked\n");
		driver.findElement(By.xpath("//html//body//form[2]//input[3]")).click();
		System.out.println(ChBox3.isSelected()+"\ncheckbox clicked\n");
		
		driver.findElement(By.xpath("//html//body//form[2]//input[4]")).click();//("/html/body/div/div/div/div/div/div/div/div/form/button[1]"));
		System.out.println("submit_2 "+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement radBtn = driver.findElement(By.xpath("//html//body//input[5]"));
		System.out.println(radBtn.isSelected()+"\nradio button not clicked\n");
		driver.findElement(By.xpath("//html//body//input[5]")).click();
		System.out.println(radBtn.isSelected()+"\nradio button clicked\n");
		
		WebElement ChBox4 = driver.findElement(By.xpath("//html//body//input[6]"));
		System.out.println(ChBox4.isSelected()+"\ncheckbox not clicked\n");
		driver.findElement(By.xpath("//html//body//input[6]")).click();
		System.out.println(ChBox4.isSelected()+"\ncheckbox clicked\n");
		
		WebElement drpdwn = driver.findElement(By.xpath("//html//body//select"));
		Select relegion = new Select(drpdwn);
		relegion.selectByVisibleText("Relegion 3");
		System.out.println(relegion.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		relegion.selectByVisibleText("Hindu");
		System.out.println(relegion.getAllSelectedOptions().getFirst().getText());
		
		driver.findElement(By.xpath("//html//body//input[7]")).click();//("/html/body/div/div/div/div/div/div/div/div/form/button[1]"));
		System.out.println("signup "+driver.getTitle());
		Thread.sleep(2000);
	
	}

}
