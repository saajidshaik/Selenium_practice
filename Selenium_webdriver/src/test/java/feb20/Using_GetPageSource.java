package feb20;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_GetPageSource {
public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://webapp.qedgetech.com/");
		//suspend tool for 5 sencs
		Thread.sleep(5000);
		String strsource = driver.getPageSource();
		System.out.println(strsource);
		driver.quit();
}
}