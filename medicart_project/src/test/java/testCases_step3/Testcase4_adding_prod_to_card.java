package testCases_step3;

import java.util.List;

import org.testng.annotations.Test;

import pom.A_registration;
import pom.D_Prod_to_card;
import test_components.Base_class_step1;

public class Testcase4_adding_prod_to_card extends Base_class_step1 {
	
	@Test
	public void addProdToCart() {
		
		A_registration LP = url.goToURL();
		D_Prod_to_card cartProd = LP.cartProd();
		cartProd.selectProd();
		List<String> prods =cartProd.addToCart("Resmed");
		System.out.println(prods);
		
		
	}

}
