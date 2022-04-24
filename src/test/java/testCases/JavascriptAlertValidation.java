package testCases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseClass.TestBaseClass;
import pageObjects.Home_Page;
import pageObjects.JavascriptAlertBoxDemo_Page;

public class JavascriptAlertValidation extends TestBaseClass{

	@Test(description="To perform JS Alert validation")
	@Parameters(value="url")
	public void jsAlertValidation(String url)
	{
		driver.get(url);
		Home_Page homeObj=new Home_Page(driver);
		JavascriptAlertBoxDemo_Page alertObj = homeObj.clickJavascriptAlertsLink();
		alertObj.clickMe();
		String alertMessage=alertObj.getAlertText();
		System.out.println("Alert Massage -> "+alertMessage);
		try{
			assertEquals(alertMessage, "I am an alert box!");
			driver.executeScript("lambda-status=passed");
		}catch(AssertionError e){
			driver.executeScript("lambda-status=failed");  
		}
		
	}
	
}
