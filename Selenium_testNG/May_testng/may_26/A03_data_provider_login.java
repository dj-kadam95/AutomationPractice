package may_26;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A03_data_provider_login {

	WebDriver driver;

	@Test(dataProvider = "data")
	public void Search(String data, String data2) throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		System.out.println(data);
		System.out.println(data2);

		driver.get("https://rahulshettyacademy.com/client/#/auth/login");

		driver.findElement(By.id("userEmail")).sendKeys(data);
		driver.findElement(By.id("userPassword")).sendKeys(data2);
		driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
		String actual = driver.findElement(By.className("toast-container")).getText();
		String Expected = "Login Successfully";

		System.out.println(driver.getTitle());
		System.out.println(actual);

		Assert.assertEquals(actual, Expected, "True............");

		driver.quit();

	}

	@DataProvider(name = "data")
	public Object[][] searchData() throws EncryptedDocumentException, IOException {

		FileInputStream excel = new FileInputStream(
				"C:\\Users\\dhkadam\\OneDrive - Capgemini\\Documents\\Grotechminds\\Selenium\\may\\may_16\\DDT.xlsx");
		Workbook wb = WorkbookFactory.create(excel);

		String[] id = new String[3];
		String[] pw = new String[3];

		for (int i = 0, j = 0; i < 3; i++) {

			id[i] = wb.getSheet("login").getRow(i).getCell(j).getStringCellValue();

		}

		List<String> data1 = Arrays.asList(id);

		for (int i = 0, j = 1; i < 3; i++) {

			pw[i] = wb.getSheet("login").getRow(i).getCell(j).getStringCellValue();

		}
		List<String> data2 = Arrays.asList(pw);

		Object[][] data = { { data1.get(1), data2.get(1) }, { data1.get(2), data2.get(2) } };

		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
		return data;

	}

}
