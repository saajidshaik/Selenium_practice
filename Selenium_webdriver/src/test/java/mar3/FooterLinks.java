package mar3;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FooterLinks {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		//get collection of footer links
		List<WebElement> footer_Links =driver.findElements(By.xpath("//div[@id='pageFooter']//following-sibling::div[2]/ul/li/a"));
		System.out.println("No of footer links are::"+footer_Links.size());
		Thread.sleep(5000);
		//print each footer link text
		for (WebElement each : footer_Links) {
			Thread.sleep(500);
			System.out.println(each.getText());
		//print each link url
			System.out.println(each.getAttribute("href"));
		}
		Thread.sleep(5000);
		driver.quit();
	}
}