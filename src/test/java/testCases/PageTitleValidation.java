package testCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseClass.TestBaseClass;
import pageObjects.Home_Page;
import utils.UIUtils;

public class PageTitleValidation extends TestBaseClass{
	
	@Test(description="To perform page title validation")
	@Parameters(value="url")
	public void pageTitleValidation(String url)
	{
		driver.get(url);
		UIUtils utilObj = new UIUtils();
		utilObj.waitTillPageLoad(driver);
		
		String expectedPageTitle="LambdaTest";
		String actualPageTitle=driver.getTitle();
		
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(actualPageTitle, expectedPageTitle);
		
		System.out.println("PageTitle extracted -> "+actualPageTitle);
		System.out.println("Page validation test completed");
		
		
		
	}
}
