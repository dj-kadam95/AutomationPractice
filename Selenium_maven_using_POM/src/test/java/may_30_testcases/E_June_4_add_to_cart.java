package may_30_testcases;

import org.testng.annotations.Test;

import may_30_test_components.B_May_30_base_test;
import pom.D_June_02_add_to_cart;

public class E_June_4_add_to_cart extends B_May_30_base_test {


	@Test
	public void addToCart() throws InterruptedException {
		
		D_June_02_add_to_cart adc = url.cart();
		adc.products();
		Thread.sleep(2000);
		adc.cartButton("Po");
	}


}
