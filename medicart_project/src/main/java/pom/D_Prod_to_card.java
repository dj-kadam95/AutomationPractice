package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
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
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath = "//div[@class='t4s-top-heading t4s_des_title_1']/following-sibling::div/descendant::span[contains(text(), 'CPAP Machine')]")
//	WebElement prod;
//	@FindBy(xpath = "(//span[text()='CPAP Machine'])[2]")(//span[text()='CPAP Machine'])[2]/parent::*
//	WebElement prod;
	@FindBy(xpath = "(//span[text()='CPAP Machine'])[2]/parent::*")
	WebElement prod;

	@FindBy(xpath = "//div[@class='t4s-product-wrapper']/descendant::a[@class='is--href-replaced']")
	List<WebElement> products;

	@FindBy(xpath = "//div[@class='t4s-product-wrapper']/descendant::span[contains(text(), 'Add to cart')]")
	List<WebElement> cartBtn;

	@FindBy(xpath = "(//button[@class='t4s-drawer__close'])[1]")
	WebElement cartClose;

	@FindBy(xpath = "(//span[@class='t4s-pa t4s-op-0 t4s-ts-op t4s-count-box'])[2]")
	WebElement cartboxcount;

	@FindBy(xpath = "//span[@class='t4s-pr t4s-icon-cart__wrap']/parent::*")
	WebElement cart;

	@FindBy(xpath = "//input[@class='t4s-quantity-input']")
	WebElement cartquanity;

	@FindBy(xpath = "//div[@class='t4s-cart__totalPrice']")
	WebElement cartTotal;

	public void selectProd() {

		waitForElementToBeClickable(prod);

		Point p1 = prod.getLocation();
		int y = p1.getY();
	//	int y1 = y - 200;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0," + y + ")");
		prod.click();
	}

	public List<String> getProds(String Prod) {

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

	public void addToCart(String Prod) {


				for (int i = 0; i < products.size(); i++) {

					String prodName = products.get(i).getText();

					if (prodName.toLowerCase().contains(Prod.toLowerCase())) {

						waitForAllElements(cartBtn);
						cartBtn.get(i).click();
						waitForElement(cartClose);
						cartClose.click();
						cartBtn.get(i).click();
						waitForElement(cartClose);

					}
				}
	}

	public String cartBoxCount() {
		
		cartClose.click();
		String cartBox = cartboxcount.getText();
		return cartBox;

	}

	public String cartQuantity() {

		waitForElementToBeClickable(cart);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", cart);

		cart.click();
		String cartQuan = cartquanity.getDomAttribute("data-current-qty");
		return cartQuan;

	}

	public String cartTotal() {

		String carttotal = cartTotal.getText();
		return carttotal;

	}
}
