package feb24;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinksCollections {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.get("https://tatacliq.com");
		Thread.sleep(5000);
		//get collection of links which are stored into tag a
		List<WebElement> all_Links =driver.findElements(By.tagName("a"));
		System.out.println(all_Links.size());
		Thread.sleep(5000);
		//iterate all links
		for (WebElement each : all_Links) {
			//print each position link name
			System.out.println(each.getText());
			//print each link url
			System.out.println(each.getAttribute("href"));
		}
		Thread.sleep(5000);
	driver.quit();
	}
}








