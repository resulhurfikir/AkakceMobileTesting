package MobileTesting.Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManager {
    private static AndroidDriver driver;


    public static AndroidDriver getAppiumDriver(){
        if(driver == null){

            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android");
            options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
            options.setPlatformVersion("11.0");
            options.setDeviceName("emulator-5554");
            //options.setPlatformVersion("13.0");  //for real device
            //options.setDeviceName("Samsung");  //for real device
            //options.setUdid("R58R4412H6P");  //for real device
            options.setAppPackage("com.akakce.akakce");
            options.setAppActivity("com.akakce.akakce.ui.splash.SplashActivity");

            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        return driver;
    }


    public static void closeApplication(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }


}