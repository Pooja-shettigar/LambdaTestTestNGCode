package baseClass;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.URL;

public class TestBaseClass {

	public String username = "poojashettigarudupi";
    public String authkey = "GyidMqMSPeDLNDEaiSmerJqY24pl7ujGA6BR2eaZgx8mPpVXQ9";
    public static RemoteWebDriver driver = null;
    public String gridURL = "@hub.lambdatest.com/wd/hub";
    boolean status = false;
  
    @BeforeMethod
    @Parameters({"browser","version","platform"})
    public void setUp(String browserName,String version,String platform) throws Exception {
       DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browserName);
        capabilities.setCapability("version", version);
        capabilities.setCapability("platform",platform);
        capabilities.setCapability("build", "Pooja_LambdaTestTestNGTest");
        capabilities.setCapability("name", "Pooja_LambdaTestTestNGTest");
        capabilities.setCapability("network", true);
        capabilities.setCapability("visual", true); 
        capabilities.setCapability("video", true);
        capabilities.setCapability("console", true);
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + gridURL), capabilities);
        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @AfterMethod
    public void tearDown() throws Exception {
       if (driver != null) {
            driver.quit();
        }
    }
  
}
