package mar11;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Using_Explicit {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/");
		//create object for webdriver wait class
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait until username textbox visible
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		driver.findElement(By.name("email")).sendKeys("ranga@qedgetech.com");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		//wait until flight booking button is clickable
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Flight Bookings']")));
		driver.findElement(By.xpath("//a[normalize-space()='Flight Bookings']")).click();
		//wait until presence of delete button
		mywait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Dele")));
		driver.findElement(By.partialLinkText("Dele")).click();
		if(mywait.until(ExpectedConditions.alertIsPresent()) != null)
		{
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Alert window not found");
		}
		}
}