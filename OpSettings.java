import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Teste {
	@Test
	public void test() throws MalformedURLException
	{
		//		
				DesiredCapabilities capacidade = new DesiredCapabilities();
				capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
				capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "");
				capacidade.setCapability("appPackage", "com.android.settings");
				capacidade.setCapability("appActivity", "com.android.settings.Settings");
				                                       
				@SuppressWarnings("rawtypes")
				//
				AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);       
				
		//
	}

}
