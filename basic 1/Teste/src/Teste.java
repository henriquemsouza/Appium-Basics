import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Teste {
	@Test
	public void test() throws MalformedURLException
	{
	
		//
		//Diretorio onde contem a apk do aplicativo que sera automatizado
				File diretorioAplicacao = new File("C:\\Users\\5.souza\\Documents\\GitHub");
				//Nome do aplicativo que deve ser
				File arquivoAplicacao = new File(diretorioAplicacao, "CalculaMediaFinal.apk");
				
				DesiredCapabilities capacidade = new DesiredCapabilities();
				//Define que a plataforma que o teste sera executado e Android
				capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
				//Define que o aplicativo sera executado pelo emulador do Android
				capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "LG K8 LTE");
				//Define qual o caminho onde esta o apk do aplicativo que sera automatizado
				capacidade.setCapability(MobileCapabilityType.APP, arquivoAplicacao.getAbsolutePath());

				@SuppressWarnings("rawtypes")
				//Instancia o driver do Android apontando para o ip do servidor Appium e passando as configuracoes defindas acima
				AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);

				//Informa as notas do campo 1, 2 e 3
				driver.findElement(By.id("com e .exemplo.calculamediafinal:id/txtNota1")).sendKeys("3");
				driver.findElement(By.id("com.exemplo.calculamediafinal:id/txtNota2")).sendKeys("2");
				driver.findElement(By.id("com.exemplo.calculamediafinal:id/txtNota3")).sendKeys("4");
				//Clica no botao Calcular
				driver.findElement(By.id("com.exemplo.calculamediafinal:id/btnCalcular")).click();
				//Compara o valor gerado no cmapo media final com o valor esperado pelo teste
		//
	}

}
