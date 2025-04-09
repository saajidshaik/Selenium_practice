package mar1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Xpath_Example {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@id,'u_0')])[2]")).click();
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("testing");
		new Select(driver.findElement(By.xpath("//select[contains(@title,'Day')]"))).selectByVisibleText("20");
		new Select(driver.findElement(By.xpath("//select[contains(@title,'Month')]"))).selectByIndex(10);
		new Select(driver.findElement(By.xpath("//select[contains(@title,'Year')]"))).selectByVisibleText("1987");
		driver.findElement(By.xpath("(//*[contains(@type,'radio')])[2]")).click();
		driver.findElement(By.xpath("(//*[contains(@class,'inputtext')])[5]")).sendKeys("pranga2010@gmail.com");
		driver.findElement(By.xpath("(//*[contains(@class,'inputtext')])[7]")).sendKeys("test#$%5");
		driver.findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();
	}
}