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
		//sp.searchProd("Tynor knee");
		sp.prods1("Medikart");
		List<String> prods = sp.products("Medikart");
		System.out.println(prods);

		String expectedProds[] = {"Medikart Compressor Nebulizer MK NE-C05", "Medikart Portable Mesh Nebulizer"};
		List<String> expectedProducts = Arrays.asList(expectedProds);
		System.out.println(expectedProducts);

		boolean found = false;

		for (String expected : expectedProds) {
			for (String actual : prods) {
				if (actual.toLowerCase().contains(expected.toLowerCase())) {
					found = true;
					break;
				}

			}
			Assert.assertTrue(found);
		}

	}

}
