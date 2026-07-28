package may_26;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A02_data_provider_annotation {

	WebDriver driver;

	@Test(dataProvider = "data")
	public void Search(String data) throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.findElement(By.className("search-keyword")).sendKeys(data);
		Thread.sleep(3000);
		driver.quit();

	}

	@DataProvider(name = "data")
	public Object[][] searchData() throws EncryptedDocumentException, IOException {

		FileInputStream excel = new FileInputStream(
				"C:\\Users\\dhkadam\\OneDrive - Capgemini\\Documents\\Grotechminds\\Selenium\\may\\may_16\\DDT.xlsx");
		Workbook wb = WorkbookFactory.create(excel);

		Object[][] data = new Object[8][1];

		for (int i = 0, j = 0; i < 4; i++) {
			data[i][j] = wb.getSheet("Search").getRow(i).getCell(j).getStringCellValue();

		}

		String item1 = wb.getSheet("Search").getRow(0).getCell(0).getStringCellValue();
		String item2 = wb.getSheet("Search").getRow(1).getCell(0).getStringCellValue();
		String item3 = wb.getSheet("Search").getRow(2).getCell(0).getStringCellValue();
		String item4 = wb.getSheet("Search").getRow(3).getCell(0).getStringCellValue();

		// Object[][] data = new Object[4][1];
		data[4][0] = item1;
		data[5][0] = item2;
		data[6][0] = item3;
		data[7][0] = item4;

		return data;

	}
}
