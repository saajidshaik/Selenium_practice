package feb25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HandlingListbox1 {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		//create select class object for day,month and year listbox
		Select daylistbox = new Select(driver.findElement(By.id("day")));
		Select monthlistbox = new Select(driver.findElement(By.id("month")));
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		//select item in day,month and year listbox
		daylistbox.selectByVisibleText("23");
		Thread.sleep(5000);
		monthlistbox.selectByVisibleText("Dec");
		Thread.sleep(5000);
		yearlistbox.selectByVisibleText("1987");
		Thread.sleep(5000);
		driver.quit();
		}
}