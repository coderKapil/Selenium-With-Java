package day41;

import org.testng.annotations.Test;

/*
 1) Open App
 2) Login
 3) Logout
 
 -4 -3 -2 -1 0 1 2 3 4 5
 */
public class FirstTestCase {
	
	@Test(priority=1)
	void logout() {
		System.out.println("logout from application.....");
	}
	
    @Test(priority=0)
	void login() {
		System.out.println("login to application.....");
	}
	
    @Test(priority=-1)
	void openApp() {
		System.out.println("opening application.....");
	}
}
