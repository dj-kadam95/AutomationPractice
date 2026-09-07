package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstract_components.WebDriverwait;

public class D_Prod_to_card extends WebDriverwait {
	
	WebDriver driver;

	public D_Prod_to_card(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='t4s-top-heading t4s_des_title_1']/following-sibling::div/child::div[3]")
    WebElement prod;
	
	@FindBy(xpath ="//div[@class='t4s-product-wrapper']/descendant::a[@class='is--href-replaced']")
	List<WebElement> products;
	
	@FindBy(xpath ="//div[@class='t4s-product-wrapper']/descendant::span[contains(text(), 'Add to cart')]")
	List<WebElement> cartBtn;
	
	public void selectProd() {
		waitForElement(prod);
		prod.click();
	}
	
	public List<String> addToCart(String Prod) {
		
		List<String> names = new ArrayList<>();
		
		for (WebElement product : products) {

			if (product.isDisplayed()) {

				String prodName = product.getText();

				if (prodName.toLowerCase().contains(Prod.toLowerCase())) {

					names.add(prodName);
				}
			}
		}

		return names;
		
		
		
	}

}
