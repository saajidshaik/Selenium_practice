package mar5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class MultipleActions {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		Actions ac =new Actions(driver);
		//mouse hover to kids
		ac.moveToElement(driver.findElement(By.xpath("//a[contains(@data-group,'kids')]"))).perform();
		Thread.sleep(5000);
		//mouse hover to footwear and click it
		ac.moveToElement(driver.findElement(By.linkText("Dresses")));
		ac.click().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		//mouse hover to electoronics
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-group='men']"))).perform();
		Thread.sleep(5000);
		//mouse hover to speakers and click it
		ac.moveToElement(driver.findElement(By.linkText("T-Shirts")));
		ac.click().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
}