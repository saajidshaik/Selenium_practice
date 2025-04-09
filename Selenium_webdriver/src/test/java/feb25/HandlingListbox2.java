package feb25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HandlingListbox2 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		//create select class object for day,month and year listbox
		Select daylistbox = new Select(driver.findElement(By.id("day")));
		Select monthlistbox = new Select(driver.findElement(By.id("month")));
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		//select items in day,month and year using selectByIndex method
		daylistbox.selectByIndex(20);
		System.out.println(daylistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		monthlistbox.selectByIndex(5);
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		yearlistbox.selectByIndex(34);
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		driver.quit();
	}
}