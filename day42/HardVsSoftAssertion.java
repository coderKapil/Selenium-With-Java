package day42;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {

	//@Test
	void hardassertions() {
		System.out.println("testing.....");
		System.out.println("testing.....");
		
		Assert.assertEquals(1, 1);
		System.out.println("testing.....");
		System.out.println("testing.....");
	}
	
	@Test
	void softassertions() {
		System.out.println("testing.....");
		System.out.println("testing.....");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);//softassertion
		System.out.println("testing.....");
		System.out.println("testing.....");
		sa.assertAll();//mandatory at the ed of the test meth to do the right validation
	}
}
