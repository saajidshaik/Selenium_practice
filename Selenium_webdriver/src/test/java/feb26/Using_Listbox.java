package feb26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Using_Listbox {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		//create select class object for day,month and year listbox
		Select daylistbox = new Select(driver.findElement(By.id("day")));
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		//verify year listbo xis single or multiselection
		boolean value = yearlistbox.isMultiple();
		System.out.println(value);
		daylistbox.selectByValue("20");
		Thread.sleep(5000);
		yearlistbox.selectByValue("1986");
		Thread.sleep(5000);
		driver.quit();
		}
}