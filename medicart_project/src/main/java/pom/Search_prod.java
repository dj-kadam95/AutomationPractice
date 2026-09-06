package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstract_components.WebDriverwait;

public class Search_prod extends WebDriverwait {

	WebDriver driver;

	public Search_prod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@class='t4s-search-header__input t4s-input__currentcolor'] ")
	WebElement searchBox;

	@FindBy(xpath = "//button[@class='t4s-search-header__submit']")
	WebElement searchBtn;

	@FindBy(xpath = "//h3[@class='t4s-product-title']/child::a")
	List<WebElement> prods;
	
	By productLocator =
	        By.xpath("//h3[@class='t4s-product-title']/child::a");

	public void searchProd(String prod) {

		waitForElement(searchBox);
		waitForElementToBeClickable(searchBox);

		searchBox.click();
		searchBox.sendKeys(prod);
		searchBtn.click();
	}

//	String names[] = new String[5];

//	public void prods1(String Prods) throws InterruptedException {
//		 waitForAtLeastOneElement(productLocator);
//		for (int i = 0; i < prods.size(); i++) {
//
//			String prodName = prods.get(i).getText();
//			if (prodName.toLowerCase().contains(Prods.toLowerCase())) {
//				System.out.println(prodName);
//
//			}
//		}
//
//	}

	public List<String> products(String Prods) throws InterruptedException {
	 //Thread.sleep(20000);
		 waitForAtLeastOneElement(productLocator);
		int prodCount = prods.size();
		List<String> names = new ArrayList<>();
		for (int i = 0; i < prodCount; i++) {

			String prodName = prods.get(i).getText();
			if (prodName.toLowerCase().contains(Prods.toLowerCase())) {

				// System.out.println(prodName);
				names.add(prodName);
			}

		}
		return names;
	}
}
