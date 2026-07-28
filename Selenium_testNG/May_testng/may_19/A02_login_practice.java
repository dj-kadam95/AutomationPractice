package may_19;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class A02_login_practice {
	
	@Test
	public void withValidCreds() throws EncryptedDocumentException, IOException {
		
		FileInputStream excel = new FileInputStream(
				"C:\\Users\\dhkadam\\OneDrive - Capgemini\\Documents\\Grotechminds\\Selenium\\may\\may_16\\DDT.xlsx");

		Workbook wb = WorkbookFactory.create(excel);

		String id = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String pw = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		
		
		String[] id1 = new String[2];
		id1[0] = id;
		id1[1] = pw;
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/client/#/auth/login");

		driver.findElement(By.id("userEmail")).sendKeys(id);
		driver.findElement(By.id("userPassword")).sendKeys(pw);
		driver.findElement(By.id("login")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
