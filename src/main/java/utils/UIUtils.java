package utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIUtils {
	public void waitTillPageLoad(RemoteWebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(webDriver -> "complete".equals(((JavascriptExecutor) driver)
		    .executeScript("return document.readyState")));
	}
}
