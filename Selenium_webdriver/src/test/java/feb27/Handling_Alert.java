package feb27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Handling_Alert {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//click sign button with out usrname and password
		driver.findElement(By.name("proceed")).click();
		//capture alert text
		String alert_mess = driver.switchTo().alert().getText();
		System.out.println(alert_mess);
		Thread.sleep(5000);
		//click ok  to alert 
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
	}
}