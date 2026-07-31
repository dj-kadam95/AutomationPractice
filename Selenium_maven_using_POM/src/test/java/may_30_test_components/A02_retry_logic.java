package may_30_test_components;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class A02_retry_logic extends B_May_30_base_test  implements IRetryAnalyzer {
	

	int initialCount =0;
	int retryCount =2;
	@Override
	public boolean retry(ITestResult result) {
		
		if(initialCount<retryCount) {
			
			initialCount++;
			return true;
			
		}
		
		return false;
	}
	
	

}
