package feb27;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiSelection {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//verify listbox is multiselection or not
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		//select 0 to 8 items in listbox
		for(int i=0;i<=8;i++)
		{
			Thread.sleep(2000);
			dropdown.selectByIndex(i);
		}
		//count no of items which are selected above in loop
		List<WebElement> selected_Items =dropdown.getAllSelectedOptions();
		System.out.println(selected_Items.size());
		//print each item name which are selected
		for (WebElement each : selected_Items) {
			System.out.println(each.getText());
		}
		//deselect items from selection
		Thread.sleep(5000);
		dropdown.deselectByVisibleText("Yellow");
		Thread.sleep(5000);
		dropdown.deselectByIndex(0);
		Thread.sleep(5000);
		dropdown.deselectByValue("brown");
		Thread.sleep(5000);
		dropdown.deselectAll();
		Thread.sleep(5000);
		driver.quit();
	}
}