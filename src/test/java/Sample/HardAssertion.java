package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void strictComparisonHardAssaet()
	{
		String expectedValue ="robin";
		String actualValue ="robin";
		Assert.assertEquals(actualValue , expectedValue);
		System.out.println("Assertion completed");
	}
	
	@Test
	public void containsComparisonHardAssert()
	{
		String expectedValue ="Don";
		String actualValue ="london";
		Assert.assertTrue(actualValue.contains(expectedValue));
		System.out.println("Contains comparison completed");
	}

}
