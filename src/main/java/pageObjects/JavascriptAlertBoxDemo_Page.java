package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavascriptAlertBoxDemo_Page {

	private RemoteWebDriver driver;
	
	public JavascriptAlertBoxDemo_Page(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@id,'next')]/section[4]/div/div/div[2]/div[1]/button[text()='Click Me']")
	@CacheLookup
	private WebElement btn_ClickMe;
	
	public void clickMe() {
		btn_ClickMe.click();
	}
	
	public String getAlertText() {
		Alert alert = this.driver.switchTo().alert();
		return alert.getText();
	}
	
}
