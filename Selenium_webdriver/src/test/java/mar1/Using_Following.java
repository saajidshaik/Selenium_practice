package mar1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Using_Following {
public static void main(String[] args) throws Throwable {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Reg')]")).click();
		driver.findElement(By.xpath("//form[@name='submenus']//following::input[1]")).sendKeys("test");
		driver.findElement(By.xpath("//form[@name='submenus']//following::input[2]")).sendKeys("7654321");
		driver.findElement(By.xpath("//form[@name='submenus']//following::input[3]")).sendKeys("test55@gmail.com");
		driver.findElement(By.xpath("//form[@name='submenus']//following::input[5]")).sendKeys("test@345");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath("//form[@name='submenus']//following::select[1]"))).selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name='submenus']//following::input[6]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name='submenus']//following::input[6]")).sendKeys("20-12-1976");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name='submenus']//following::input[7]")).click();
		driver.findElement(By.xpath("//form[@name='submenus']//following::input[8]")).click();
		Thread.sleep(5000);
		driver.quit();
		}
}






