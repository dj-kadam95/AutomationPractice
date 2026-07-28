package may_28;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(A03_listners.class)
public class A02_retry_analyzer2 extends A03_listners {

	@Test(dataProvider = "data", retryAnalyzer = A02_retry_logic.class)
	public void login(String data1, String data2) throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(data1);
		System.out.println(data2);

		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		String Expected1 = "Login Successfully";
		String Expected2 = "Incorrect emaild or password.";

		driver.findElement(By.id("userEmail")).sendKeys(data1);
		driver.findElement(By.id("userPassword")).sendKeys(data2);
		driver.findElement(By.id("login")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);

		String actual = driver.findElement(By.className("toast-container")).getText();
		if (actual.equals(Expected1)) {

			System.out.println(actual);
			System.out.println(Expected1);
			Assert.assertEquals(actual, Expected1, "True............");
			

		} else {

			System.out.println(actual);
			System.out.println(Expected2);
			Assert.assertEquals(actual, Expected2, "True............");
			
		}
		

	}

	@DataProvider(name = "data")
	public Object[][] searchData() throws EncryptedDocumentException, IOException {

		FileInputStream excel = new FileInputStream(
				"C:\\Users\\Dnyaneshwar\\OneDrive\\DDT.xlsx");
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
