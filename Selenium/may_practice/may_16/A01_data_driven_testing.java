package may_16;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class A01_data_driven_testing {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		String id = A01_data_driven_testing.data()[0];
		String pw = A01_data_driven_testing.data()[1];
		
	//	System.out.println(A01_data_driven_testing.data()[2]);

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/client/#/auth/login");

		driver.findElement(By.id("userEmail")).sendKeys(id);
		driver.findElement(By.id("userPassword")).sendKeys(pw);
		driver.findElement(By.id("login")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

	public static String[] data() throws EncryptedDocumentException, IOException {

//      Step 1
		FileInputStream excel = new FileInputStream("C:\\Users\\Dnyaneshwar\\Documents\\Java_Selenium\\DDT.xlsx");

//      Step 2
		Workbook wb = WorkbookFactory.create(excel);

//		Step 3
//		Sheet s1 = wb.getSheet("Login");

//		Step 4
//		Row r1 = s1.getRow(1);

//		Step 5
//		Cell c1 = r1.getCell(0);
//		Cell c2 = r1.getCell(1);

//		Step 6
//		String id =c1.getStringCellValue();

		String id = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String pw = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		//double num = wb.getSheet("login").getRow(1).getCell(2).getNumericCellValue();
		
	//	String pw1 =NumberToTextConverter.toText(num);
		
		
		String[] id1 = new String[3];
		id1[0] = id;
		id1[1] = pw;
	//	id1[2] = pw1;

		return id1;

	}

}
