import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiautomator extends base {
    public static void main(String[] args) throws Exception {
        AndroidDriver<AndroidElement> driver=Capabilities();

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize()); 
    }
}
