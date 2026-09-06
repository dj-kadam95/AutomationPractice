package pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstract_components.Wait;

public class D_June_02_add_to_cart extends Wait {

	WebDriver driver;
	
	public D_June_02_add_to_cart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "search-keyword")
	WebElement search;

	@FindBy(css = "h4.product-name")
	List<WebElement> prods;
	
	@FindBy(css = "h4.product-name")
	WebElement prod1;

	@FindBy(className = "product-action")
	List<WebElement> cartButton;

	public void products() {
		search.sendKeys("Po");
	}


	int count = 0;

	public void cartButton(String abc) throws InterruptedException {
		

		for (int i = 0; i < prods.size(); i++) {

			String ab = prods.get(i).getText();
		
			if (ab.toLowerCase().contains(abc.toLowerCase())) {
				System.out.println(ab);
				count++;
				cartButton.get(i).click();
			}
		}
		
		System.out.println("count "+count);
	}

}
