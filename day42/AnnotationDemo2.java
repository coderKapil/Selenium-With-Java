package day42;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 1)Login--> @BeforeMethod
 2)Search--> @Test
 3)Logout-->@AfterMethod
 4)Login
 5)Adv. Search--->@Test
 6)Logout
 */
public class AnnotationDemo2 {

	@BeforeClass
	void login() {
		System.out.println("this is login.....");
	}
	@Test(priority=1)
	void search() {
		System.out.println("this is search.....");
	}
	@Test(priority=2)
	void advSearch() {
		System.out.println("advanced search.....");
	}
	@AfterClass
    void logout() {
		System.out.println("this is logout.....");
	}
}
