import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class FacebookLogin {
//
	@Test
	public void test2() throws MalformedURLException
	{
		//		
				DesiredCapabilities capacidade = new DesiredCapabilities();
				capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
				capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "LG K8 LTE");
				capacidade.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
				@SuppressWarnings("rawtypes")
				//Instancia o driver do Android apontando para o ip do servidor Appium e passando as configuracoes defindas acima
				AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);

				//Informa as notas do campo 1, 2 e 3
				driver.get("http://www.facebook.com");
				System.out.println("Title "+driver.getTitle());
        //enter 
				driver.findElement(By.name("email")).sendKeys("");		 
				// enter password
				driver.findElement(By.name("pass")).sendKeys(");		 
				// click on submit button
				driver.findElement(By.id("u_0_7")).click();
		//
	}
//
}
