package peraScreens;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onboarding {

    @AndroidFindBy(id = "versluisant.kredit24:id/tv_skip")
    private WebElement skipButton;

    private WebDriver driver;

    public Onboarding (final WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PhoneScreen clickSkipButton () {
        skipButton.click();
        return new PhoneScreen(driver);
    }

}
