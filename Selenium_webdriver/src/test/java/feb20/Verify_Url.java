package feb20;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verify_Url {
public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://webapp.qedgetech.com/");
		Thread.sleep(5000);
		String Expected ="https://";
		//get url in runtime
		String Actual = driver.getCurrentUrl();
		//verify actual contains expected or not
		if(Actual.startsWith(Expected))
		{
			System.out.println("Url is secured::"+Expected+"    "+Actual);
		}
		else
		{
			System.out.println("Url is Not secured::"+Expected+"    "+Actual);
		}
		driver.quit();
	}
}
