package mar4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyElement {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.name("txtUsername"));
		boolean value_flag= username.isEnabled();
		System.out.println(value_flag);
		if(value_flag)
		{
			username.sendKeys("Admin");
		}
		else
		{
			System.out.println("username textbox is disabled");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}