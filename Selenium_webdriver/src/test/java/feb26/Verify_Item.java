package feb26;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Verify_Item {
	public static void main(String[] args) throws Throwable {
	    String Expected_Item ="baby";
	    //String Expected_Item ="Hyderabab";
		boolean Item_Exist =false;
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		//store listbox into select class
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items in listbox
		List<WebElement> items =listbox.getOptions();
		System.out.println("No of items are::"+items.size());
		for (WebElement each : items) {
			//get each item text
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
			System.out.println(Expected_Item+"   "+"Item Found in Listbox");
		}
		else {
			System.out.println(Expected_Item+"   "+"Item Not Found in Listbox");
		}
		Thread.sleep(5000);
		driver.quit();
	}
}