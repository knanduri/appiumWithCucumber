package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;



public class userQuoteDetails {

    public static AppiumDriver driver;

    @Given("^the user navigates to health funnel$")
    public void the_user_navigates_to_health_funnel() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Given("^enters the quote details$")
    public void enters_the_quote_details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://stage.qantasassure.com/health-insurance/quote");
    }
}


/*
    // Write code here that turns the phrase above into concrete actions
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
                URL url = new URL("http://127.0.0.1:4723/wd/hub");
                AppiumDriver driver;
                driver = new AppiumDriver(url, desiredCapabilities);

                // Navigate to the page and interact with the elements on the guinea-pig page using id.
                driver.get("http://saucelabs.com/test/guinea-pig");
                WebElement div = driver.findElement(By.id("i_am_an_id"));
                Assert.hasText("I am a div", div.getText()); //check the text retrieved matches expected value
                driver.findElement(By.id("comments")).sendKeys("My comment"); //populate the comments field by id.

                //close the app.
                driver.quit();*/
