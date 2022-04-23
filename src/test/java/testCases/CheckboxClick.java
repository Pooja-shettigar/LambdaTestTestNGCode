package testCases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseClass.TestBaseClass;
import pageObjects.CheckboxDemo_Page;
import pageObjects.Home_Page;

public class CheckboxClick extends TestBaseClass{
	
	@Test(description="To perform checkbox validation")
	@Parameters(value="url")
	public void checkboxValidation(String url)
	{
		driver.get(url);
		Home_Page homeObj=new Home_Page(driver);
		CheckboxDemo_Page checkboxObj=homeObj.clickCheckboxDemoLink();
		System.out.printf(" Checkbox selected ?-> ",checkboxObj.isCheckboxSelected());
		assertEquals(false, checkboxObj.isCheckboxSelected());
		checkboxObj.clickSingleCheckbox();
		System.out.printf(" Checkbox selected ?-> ",checkboxObj.isCheckboxSelected());
		assertEquals(true, checkboxObj.isCheckboxSelected());
		driver.executeScript("lambda-status=passed");
	}
	
}
