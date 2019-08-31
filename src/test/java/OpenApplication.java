import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class OpenApplication {

    @Test
   public void openApplication() throws MalformedURLException, InterruptedException {
       DesiredCapabilities capabilities = new DesiredCapabilities();
       capabilities.setCapability("automationName","Appium");
       capabilities.setCapability("platformName","Android");
       capabilities.setCapability("deviceName","Nexus 5X API 27");
       capabilities.setCapability("platformVersion","8.1");
       capabilities.setCapability("app","C:\\Users\\Ahmed\\Desktop\\app-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);

        driver.findElement(By.id("com.example.abdelrahmanhesham.musicalstructure:id/playing_now_button")).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

       driver.findElement(By.id("com.example.abdelrahmanhesham.musicalstructure:id/songs_button")).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        driver.findElement(By.id("com.example.abdelrahmanhesham.musicalstructure:id/artists_button")).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        driver.findElement(By.id("com.example.abdelrahmanhesham.musicalstructure:id/albums_button")).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
   }

}