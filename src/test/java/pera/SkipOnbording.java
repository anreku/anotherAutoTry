package pera;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import peraScreens.Onboarding;
import peraScreens.PhoneScreen;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SkipOnbording {

    private AppiumDriver<WebElement> driver;
    private List<Integer> values;

    @Before
    public void setUp () throws Exception
    {
        // set up appium
        File appDir = new File(System.getProperty("user.dir"), "apk");
        File app = new File(appDir, "pera247-1.5.2-185-dev-release.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "7.1.2");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName", "Redmi");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appActivity","versluisant.kredit24.activities.SplashActivity");


        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        values = new ArrayList<Integer>();


    }

    @After
    public void tearDown ()
    {
        driver.quit();
    }

    @Test
    public void happyPath ()
    {
        final Onboarding onboarding = new Onboarding(driver);
        onboarding.clickSkipButton();
        final PhoneScreen phoneScreen = new PhoneScreen(driver);
    }
}
