package feb20;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GetCommands {
public static void main(String[] args) throws Throwable {
		//create instance obejct
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launh url
		driver.get("https://amazon.in");
		//suspend toolfor 5 secs
		Thread.sleep(5000);
		//print title and lenght of title
		String pagetitle =driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and lenght of url
		String strUrrl = driver.getCurrentUrl();
		System.out.println(strUrrl);
		System.out.println(strUrrl.length());
		//suspend tool for 5 secs
		Thread.sleep(5000);
		driver.quit();
	}
}