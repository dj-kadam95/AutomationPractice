package testCases_step3;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.A_registration;
import pom.C_search_prod;
import test_components.Base_class_step1;

public class Testcase3_search_product extends Base_class_step1 {

	@Test(groups = "regression")
	public void searchProduct() throws InterruptedException {
		A_registration LP = url.goToURL();
		C_search_prod sp = LP.search();
		// sp.searchProd("Tynor knee");
		String prodsArray[] = sp.prods1("FALCON");
		List<String> prods1 = Arrays.asList(prodsArray);
		System.out.println(prods1);
		List<String> prods2 = sp.products("FALCON");
		System.out.println(prods2);

		Assert.assertEquals(prods1, prods2);

		String expectedProds[] = { "FALCON-4002B", "FALCON-4002A" };
		List<String> expectedProducts = Arrays.asList(expectedProds);
		System.out.println(expectedProducts);

		for (String expected : expectedProds) {
			boolean found = false;
			for (String actual : prods2) {
				if (actual.toLowerCase().contains(expected.toLowerCase())) {
					found = true;
					break;
				}
			}
			Assert.assertTrue(found);
		}
	}
}
