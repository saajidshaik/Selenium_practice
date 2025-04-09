package mar4;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginJavaScript {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin3'");
		js.executeScript("document.getElementById('txtPassword').value='Qedge123!@#'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#btnLogin').click()");
		Thread.sleep(5000);
		String Expected ="dashboard";
		String Actual =js.executeScript("return document.URL").toString();
		if(Actual.contains(Expected))
		{
			System.out.println("Login Success");
		}
		else
		{
			String erro_mess = js.executeScript("return document.querySelector('#spanMessage').innerHTML").toString();
			System.out.println(erro_mess);
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
