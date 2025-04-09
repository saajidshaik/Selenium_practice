package tables;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingTable1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/tools/forex");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.className("dataTable"));
		//get rows collection from webtable
		List<WebElement> rows= webtable.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+(rows.size()-1));
		Thread.sleep(5000);
		for (WebElement each : rows) {
			//get columns collection from each row
			List<WebElement> cols = each.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				Thread.sleep(1000);
				System.out.print("\t"+   "||" +eachcell.getText()+"    "+"||");
			}
			System.out.println();
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}
		Thread.sleep(5000);
		driver.quit();
	}
}