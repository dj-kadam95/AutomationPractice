package may_29;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class A01_broken_links {
	
	public WebDriver driver;
	
	@Test
	public void broken_links() throws IOException {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<linkCount.size(); i++){
			
		   String url=	linkCount.get(i).getDomAttribute("href");
			System.out.println(url);
			System.out.println(linkCount.get(i).getText()+" "+i);
			
			verifyLink(url);
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void verifyLink(String url) throws IOException {
		
		URL VL = new URL(url);
		URLConnection uc = VL.openConnection();
	HttpURLConnection con=	(HttpURLConnection) uc;
	con.setConnectTimeout(5000);
	con.connect();
		if(con.getResponseCode()==200) {
			System.out.println("Valid link");
		}else {
			System.out.println("Broken link");
			
		}
	}

}
