package Framework.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	
	@BeforeSuite
	public void testsuite() {
		System.out.println("1. BeforeSuite");
		
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("2 . BeforeTest");
		
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("3 . BeforeClass");
		
	}
	
	
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("4. BeforeMethod");
		
		
	}
	@Test
	public void testCase2 () {
		System.out.println("5. BeforeTest");
		
	}
	//****************************
	
	@AfterMethod
	public void afterMthod() {
		System.out.println("4. afterMthod");
	}
	
	
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("3 . afterClas");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("5. afterTest");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("1. afterSuite");
	}
	
	
}
