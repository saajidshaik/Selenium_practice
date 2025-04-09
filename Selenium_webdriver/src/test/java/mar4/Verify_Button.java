package mar4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verify_Button {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		WebElement loginbutton = driver.findElement(By.name("Submit"));
		boolean value_flag = loginbutton.isDisplayed();
		System.out.println(value_flag);
		if(value_flag)
		{
			System.out.println("Login button displayed in login page");
		}
		else
		{
			System.out.println("Login button is Not displayed in login page");
		}
		Thread.sleep(5000);
		driver.quit();
	}
}