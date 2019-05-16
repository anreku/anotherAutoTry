package peraScreens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PhoneScreen {
    public PhoneScreen(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
