package feb26;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Listbox_Collections {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://amazon.in");
		Thread.sleep(5000);
		//store listbox into select class object
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of all items in listbox
		List<WebElement> items =listbox.getOptions();
		System.out.println("No of items are::"+items.size());
		//iterate all items in listbox
		for (WebElement each : items) {
			//print each position item name
			Thread.sleep(1000);
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.quit();
		}
}