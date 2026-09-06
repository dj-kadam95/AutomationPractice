package testCases_step3;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.Registration;
import pom.Search_prod;
import test_components.Base_class_step1;

public class Testcase3_search_product extends Base_class_step1 {

	@Test(groups = "regression")
	public void searchProduct() throws InterruptedException {
		Registration LP = url.goToURL();
		Search_prod sp = LP.search();
		Thread.sleep(2000);
		sp.searchProd("Tynor knee");
		String prods[] = sp.products("TYNOR");
		System.out.println(prods.length);
		List<String> actualProducts = Arrays.asList(prods);
		System.out.println(actualProducts);

		String expectedProds[] = { "TYNOR Knee Support Hinged (Neoprene), for Joint Stability & Pain Relief",
				"TYNOR Knee Immobiliser 19" };
		List<String> expectedProducts = Arrays.asList(expectedProds);
		System.out.println(expectedProducts);

		boolean found = false;

		for (String expected : expectedProds) {
			for (String actual : actualProducts) {
				if (actual.toLowerCase().contains(expected.toLowerCase())) {
					found = true;
					break;
				}

			}
			Assert.assertTrue(found);
		}

	}

}
