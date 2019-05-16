package pera;

import org.junit.Test;
import org.openqa.selenium.By;
import peraScreens.Onboarding;
import peraScreens.PhoneScreen;

public class TestWithExtendFromBaseTest extends BaseTest {
    @Test
    public void testTapToSkip() throws  Exception {

        waitForElementAndClick(By.id("tv_skip"),
                "ne nauti 1",
                5);
    }

}
