package pom;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstract_components.WebDriverwait;

public class C_search_prod extends WebDriverwait {

	WebDriver driver;

	public C_search_prod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@class='t4s-search-header__submit']/preceding-sibling::*")
	WebElement searchBox;

	@FindBy(xpath = "//button[@class='t4s-search-header__submit']")
	WebElement searchBtn;

	@FindBy(xpath = "//h3[@class='t4s-product-title']/child::a[contains(text(),'FALCON')]")
	List<WebElement> prods;

	public void searchProd(String prod) {

		waitForElement(searchBox);
		waitForElementToBeClickable(searchBox);

		searchBox.click();
		searchBox.sendKeys(prod);
		searchBtn.click();
	}

	String names[] = new String[2];

	public String[] prods1(String Prods) throws InterruptedException {

		for (int i = 0; i < prods.size(); i++) {

			String prodName = prods.get(i).getText();
			if (prodName.toLowerCase().contains(Prods.toLowerCase())) {
				names[i] = prodName;

			}
		}
		return names;
	}

	public List<String> products(String Prods) {

		List<String> names = new ArrayList<>();

		for (WebElement product : prods) {

			if (product.isDisplayed()) {

				String prodName = product.getText();

				if (prodName.toLowerCase().contains(Prods.toLowerCase())) {

					names.add(prodName);
				}
			}
		}
		return names;
	}
}
