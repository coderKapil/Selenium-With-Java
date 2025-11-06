package day42.pack;

import org.testng.annotations.*;

public class AllAnnotations {
	
	@BeforeSuite
	void bs() {
		System.out.println("this is before suite method.....");
	}
	
	@AfterSuite
	void as() {
		System.out.println("this is after suite method.....");
	}

	@BeforeTest
	void bt() {
		System.out.println("this is BeforeTest method.....");
	}
	
	@AfterTest
	void at() {
		System.out.println("this is after test method.....");
	}
	
	@BeforeClass
	void bc() {
		System.out.println("this is before class.....");
	}
	@AfterClass
    void ac() {
		System.out.println("this is after class.....");
	}
	
	@BeforeMethod
	void bm() {
		System.out.println("this is before method.....");
	}
	
	@AfterMethod
    void am() {
		System.out.println("this is after method.....");
	}
	
	@Test(priority=1)
	void tm1() {
		System.out.println("this is test method1.....");
	}
	
	@Test(priority=2)
	void tm2() {
		System.out.println("this is test method2.....");
	}
	
	
	
	
	
	
	
	
	
	
	
}
