package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxDemo_Page {

	private RemoteWebDriver driver;
	
	public CheckboxDemo_Page(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input#isAgeSelected")
	@CacheLookup
	private WebElement checkbox;
	
	public boolean isCheckboxSelected() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated (By.cssSelector("input#isAgeSelected")));
		return checkbox.isSelected();
	}
	public void clickSingleCheckbox() {
		this.checkbox.click();
	}

}
