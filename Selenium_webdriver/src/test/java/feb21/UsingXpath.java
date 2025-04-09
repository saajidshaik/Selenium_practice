package feb21;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class UsingXpath {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		//click register link
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Akhilesh");
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("547895478");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test45@gmail.com");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("admin123");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Male");
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).sendKeys("20-12-1987");
		driver.findElement(By.xpath("//input[@id='flexCheckChecked']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}