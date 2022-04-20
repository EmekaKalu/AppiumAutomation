import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class gestures extends base {
    public static void main(String[] args) throws Exception {

        //this calls the capabilities from the base.java file
        AndroidDriver<AndroidElement> driver=Capabilities();

        //click the Views button
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        

        AndroidTouchAction tAction = new AndroidTouchAction(driver);
        
        AndroidElement expand = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        tAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(expand))).perform();
        
        tAction.press(PointOption.point (207, 275)).release().perform();

        AndroidElement lp = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        LongPressOptions lOptions = new LongPressOptions();
        lOptions.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(lp));

        tAction.longPress(lOptions).release().perform(); 
    }
}
