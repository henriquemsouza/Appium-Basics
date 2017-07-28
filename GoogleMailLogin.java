import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class GoogleMailLogin {
//
	@Test
	public void test3() throws MalformedURLException
	{
		//		
				DesiredCapabilities capacidade = new DesiredCapabilities();
				capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
				capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "LG K8 LTE");

				capacidade.setCapability( "appPackage", "com.google.android.gm");
				capacidade.setCapability( "appActivity", "com.google.android.gm.ConversationListActivityGmail");
				@SuppressWarnings("rawtypes")
				//Instancia o driver do Android apontando para o ip do servidor Appium e passando as configuracoes defindas acima
				AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);
		
				driver.findElement(By.id("com.google.android.gm:id/welcome_tour_got_it")).click();
				driver.findElement(By.id("com.google.android.gm:id/setup_addresses_add_another")).click();
			
				driver.findElement(By.xpath("//android.widget.TextView[@text='Google']")).click();
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//email field
				driver.findElement(By.id("identifierId")).sendKeys("");
				driver.findElement(By.id("identifierNext")).click();
				//passsword field
				driver.findElement(By.id("password")).sendKeys("");
				driver.findElement(By.id("passwordNext")).click();
				
				driver.findElement(By.id("next")).click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//android.widget.Switch[@text='ON']")).click();
				
				driver.quit();
					 
				
		//
	}

}
