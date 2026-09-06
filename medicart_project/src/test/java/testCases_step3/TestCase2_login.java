package testCases_step3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.Login;
import pom.Registration;
import test_components.Base_class_step1;

public class TestCase2_login extends Base_class_step1 {
	
	@Test(dataProvider = "Data", priority = 2, groups="captcha")
	public void login(String id, String PW, String text) {

		Registration LP = url.goToURL();
		Login login = LP.loginBtn();
		login.login(id, PW);
		String actualText=login.waitForElement();
		String expectedText=text;
		System.out.println(actualText);
		System.out.println(expectedText);
		Assert.assertEquals(actualText, expectedText);
		login.skipBtn();

	}

	@DataProvider(name = "Data")
	public Object[][] getData() throws EncryptedDocumentException, IOException {

		FileInputStream excel = new FileInputStream("D:\\interview prep\\MedicardAcDetails.xlsx");
		Workbook sheet = WorkbookFactory.create(excel);

		Object[][] data = new Object[1][3];

		for (int j = 0, i = 0, k = 1; j <= 2; j++) {

			data[i][j] = sheet.getSheet("Login").getRow(k).getCell(j).getStringCellValue();

		}

		return data;
	}
}
