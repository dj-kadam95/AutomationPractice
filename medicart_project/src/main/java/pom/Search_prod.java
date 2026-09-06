package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_prod {

	WebDriver driver;
	public Search_prod(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//input[@placeholder='Search for products']")
	WebElement search_prod;
	
	@FindBy(xpath="//button[@class='t4s-search-header__submit']") 
	WebElement searchBtn;
	
	@FindBy(xpath="//h3[@class='t4s-product-title']/child::a")
	List<WebElement> prods;
	
	public void searchProd(String prod) {
		search_prod.sendKeys(prod);
		searchBtn.click();
	}
	
	String names[] = new String[12];
	
	public String[] products(String Prods) {
		int prodCount=prods.size();
		for(int i=0; i<prodCount; i++) {
			
			String prodName=prods.get(i).getText();
			if(prodName.toLowerCase().contains(Prods.toLowerCase())) {
				
			//System.out.println(prodCount);
				names[i]= prodName;
			}
			
		}
		return names;
	}
}
