package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {
	
	@Test(retryAnalyzer=genericUtility.RetryAnalyzerImplementation.class)
//	@Test(invocationCount=3)
	public void sample()
	{
		Assert.fail();
		System.out.println("Hi");
	}

}
