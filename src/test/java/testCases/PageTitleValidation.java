package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import baseClass.TestBaseClass;


public class PageTitleValidation extends TestBaseClass{
	
	@Test(description="To perform page title validation")
	@Parameters(value="url")
	public void pageTitleValidation(String url)
	{
		driver.get(url);
		
		String expectedPageTitle="LambdaTest";
		String actualPageTitle=driver.getTitle();
		
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(actualPageTitle, expectedPageTitle);
		
		System.out.println("PageTitle extracted -> "+actualPageTitle);
		System.out.println("Page validation test completed");
		
		driver.executeScript("lambda-status=passed");
		
		
	}
}
