package Sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void strictcomparisonSoftAssert()
	{
		String expectedValue ="raja";
		String actualValue ="Raja";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualValue, expectedValue);
		System.out.println("Strict comparison soft assertion completed");
		s.assertAll();
	}
	
	@Test
	public void containsComparionSoftAssert()
	{
		String expectedValue ="corn";
		String actualValue ="babycorn";
		SoftAssert s=new SoftAssert();
		s.assertFalse(actualValue.contains(expectedValue));
		System.out.println("Contains soft assertion completed");
		s.assertAll();
	}

}
