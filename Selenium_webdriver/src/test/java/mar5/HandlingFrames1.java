package mar5;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandlingFrames1 {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//get collection of rames
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames are::"+frames.size());
		//switchto frame wwidex number
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		ac.clickAndHold(src).moveToElement(target).release().perform();
		if(target.getText().contains("Dropped!"))
		{
			System.out.println("src dropped into target");
		}
		else
		{
			System.out.println("src Not dropped into target");
		}
		//switch back to main html
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Dialog"))).click().perform();
		Thread.sleep(5000);
		driver.quit();
}
}