package testCases_step3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.Login;
import pom.Registration;
import test_components.Base_class_step1;

public class testCase1_registration extends Base_class_step1 {

	@Test(dataProvider = "Data")
	public void registration(String name, String Lname, String id, String PW, String text) throws InterruptedException {
		Registration LP = url.goToURL();
		LP.loginBtn();
		LP.createAcBtn();
		LP.register(name, Lname, id, PW);
		LP.waitForElement(text);
	}

	@Test(dataProvider = "Data", priority = 2)
	public void login(String name, String Lname, String id, String PW, String text) {
		Registration reg = url.goToURL();
		reg.loginBtn();
		Login login = new Login(driver);
		login.login(id, PW);
		login.waitForElement(text);

	}

	@DataProvider(name = "Data")
	public Object[][] getData() throws EncryptedDocumentException, IOException {

		FileInputStream excel = new FileInputStream("D:\\interview prep\\MedicardAcDetails.xlsx");
		Workbook sheet = WorkbookFactory.create(excel);

		Object[][] data = new Object[1][5];

		for (int j = 0, i = 0, k = 1; j <= 4; j++) {

			data[i][j] = sheet.getSheet("Data").getRow(k).getCell(j).getStringCellValue();

		}

		return data;
	}
}