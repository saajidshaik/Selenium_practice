package feb28;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingWindow {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		Set<String> allwins= driver.getWindowHandles();
		Object [] windows =allwins.toArray();
		String window1= windows[0].toString();
		String window2 = windows[1].toString();
		String window3 = windows[2].toString();
		//switch to child window
		driver.switchTo().window(window2);
		Thread.sleep(5000);
		String Expected ="Google Account Help";
		String Actual = driver.getTitle();
		if(Actual.equalsIgnoreCase(Expected))
		{
			System.out.println("Title is Matching::"+Expected+"   "+Actual);
		}
		else
		{
			System.out.println("Title is Not Matching::"+Expected+"   "+Actual);
		}
		Thread.sleep(5000);
		driver.close();
		//switch to parent
		driver.switchTo().window(window1);
		Thread.sleep(5000);
		String Expected_Title ="gmail";
		String Actual_title= driver.getTitle();
		if(Actual_title.equalsIgnoreCase(Expected_Title))
		{
			System.out.println("Title is Matching::"+Expected_Title+"   "+Actual_title);	
		}
		else
		{
			System.out.println("Title is Not Matching::"+Expected_Title+"   "+Actual_title);
		}
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(window3);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		}
}