package mar7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RowAndCellCount {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://money.rediff.com/indices");
		driver.get("https://money.rediff.com/tools/forex");
		Thread.sleep(5000);
		//store table into webelement
		WebElement webtable = driver.findElement(By.className("dataTable"));
		//get row collection from webtable
		List<WebElement> rows =webtable.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+(rows.size()-1));
		Thread.sleep(5000);
		for(int i=1;i<rows.size();i++)
		{
			//get cell collection from each row
			List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row No."+i+"      "+"column size::"+cols.size());
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
