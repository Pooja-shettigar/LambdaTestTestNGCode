package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.TestBaseClass;
import pageObjects.Home_Page;
import pageObjects.JavascriptAlertBoxDemo_Page;
import utils.UIUtils;

public class JavascriptAlertValidation extends TestBaseClass{

	@Test(description="To perform JS Alert validation")
	@Parameters(value="url")
	public void jsAlertValidation(String url)
	{
		driver.get(url);
		UIUtils utilObj = new UIUtils();
		Home_Page homeObj=new Home_Page(driver);
		JavascriptAlertBoxDemo_Page alertObj = homeObj.clickJavascriptAlertsLink();
		utilObj.waitTillPageLoad(driver);
		alertObj.clickMe();
		String alertMessage=alertObj.getAlertText();
		System.out.println("Alert Massage -> "+alertMessage);
		assertEquals(alertMessage, "I am an alert box!");
		
		
	}
	
}
