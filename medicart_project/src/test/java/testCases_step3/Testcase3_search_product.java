package testCases_step3;

import org.testng.annotations.Test;

import test_components.Base_class_step1;

public class Testcase3_search_product extends Base_class_step1 {
	
	@Test(groups="regression")
	public void searchProduct()
	{
		url.goToURL();
	}

}
