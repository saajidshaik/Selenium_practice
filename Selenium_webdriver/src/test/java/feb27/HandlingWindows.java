package feb27;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingWindows {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//get parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//click three links to open in new tabs
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collection of all windows
		Set<String> allwins =driver.getWindowHandles();
		System.out.println(allwins);
		//iterate all windows
		for (String each : allwins) {
			//parent id should not be equal to child window
			if(!parent.equals(each))
			{
				//switch to each child window get title and close them
				driver.switchTo().window(each);
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				Thread.sleep(5000);
				driver.close();
			}
		}
		//switch to parent 
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("pranaga2010");
		Thread.sleep(5000);
		driver.quit();
	}
}