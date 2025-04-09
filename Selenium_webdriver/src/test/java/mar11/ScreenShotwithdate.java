package mar11;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ScreenShotwithdate {
public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/");
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("ranga@qedgetech.com");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		//wait until flight booking button is clickable
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Flight Bookings']")));
		//java time stamp
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("YYYY_MM_dd hh_mm_ss");
		String datef =df.format(date);
		//take screen shot and store into one variable
				File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//copy screen shot into local system
				try {
					FileUtils.copyFile(screen, new File("d:/myscreenshot/"+datef+"---"+"homepage.png"));
				} catch (Throwable e) {
					System.out.println(e.getMessage());
				}
				driver.quit();

	}

}