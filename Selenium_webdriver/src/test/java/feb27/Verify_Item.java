package feb27;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Verify_Item {
public static void main(String[] args) throws Throwable {
		String Expected_Item ="black";
		boolean Item_Exist=false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/MultiListboxHtmlpage.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//get collection of all items in dropdown
		List<WebElement> all_Items = dropdown.getOptions();
		System.out.println("No of items are::"+all_Items.size());
		Thread.sleep(5000);
		for (WebElement each : all_Items) {
			String Actual_Items = each.getText();
			Thread.sleep(1000);
			System.out.println(Actual_Items);
			if(Actual_Items.equalsIgnoreCase(Expected_Item))
			{
				Item_Exist=true;
				break;
			}
		}
		if(Item_Exist)
		{
			System.out.println(Expected_Item+"    "+"Item Exist In DropwDown");
		}
		else
		{
			System.out.println(Expected_Item+"    "+"Item Not Exist In DropwDown");
		}
		Thread.sleep(5000);
	driver.quit();
	}
}