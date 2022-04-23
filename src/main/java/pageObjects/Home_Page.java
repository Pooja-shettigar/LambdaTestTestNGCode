package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	private RemoteWebDriver driver;
	
	public Home_Page(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Checkbox Demo']")
	@CacheLookup
	private WebElement link_CheckboxDemo;
	
	@FindBy(linkText = "Javascript Alerts")
	@CacheLookup
	private WebElement link_JavascriptAlerts;
	
	public CheckboxDemo_Page clickCheckboxDemoLink() {
		this.link_CheckboxDemo.click();
		return new CheckboxDemo_Page(this.driver);
	}
	
	public JavascriptAlertBoxDemo_Page clickJavascriptAlertsLink() {
		this.link_JavascriptAlerts.click();
		return new JavascriptAlertBoxDemo_Page(this.driver);
	}
}
