package may_19;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class A03_testng_annotations {
	
	@Test
	public void test() {
		System.out.println("test");	
	}
	@Test
	public void test1() {
		System.out.println("test1");	
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");	
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");	
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");	
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");	
	}
	public void method() {
		System.out.println("method-");	
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");	
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");	
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");	
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("AfterMethod");	
	}

}
