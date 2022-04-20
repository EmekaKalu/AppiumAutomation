import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class swipe extends base {
    public static void main(String[] args) throws Exception {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByXPath("//android.widget.TextView[@content-desc='Date Widgets']").click();
        AndroidTouchAction tAction = new AndroidTouchAction(driver);
        tAction.press(PointOption.point (177, 401)).release().perform();
        driver.findElementByXPath("//*[@content-desc='9']").click();

        //to perform swipe action
        tAction.press(PointOption.point(777, 808))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo(PointOption.point(306, 808)).release().perform();


       
    }
}
