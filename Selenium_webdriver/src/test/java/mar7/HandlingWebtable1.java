package mar7;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingWebtable1 {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/tools/forex");
		Thread.sleep(5000);
		//store table into webelement
		WebElement webtable = driver.findElement(By.className("dataTable"));
		//get collection of rows in table
		List<WebElement> rows =webtable.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		List<WebElement> cols =rows.get(10).findElements(By.tagName("td"));
		String curname = cols.get(0).getText();
		String currate = cols.get(1).getText();
		System.out.println(curname+"      "+currate);
		Thread.sleep(5000);
		driver.quit();
			}
}
