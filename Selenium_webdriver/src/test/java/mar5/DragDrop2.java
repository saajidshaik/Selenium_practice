package mar5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragDrop2 {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		WebElement myframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(myframe);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		//get location of target
		int x = target.getLocation().getX();
		int y= target.getLocation().getY();
		System.out.println(x+"    "+y);
		ac.dragAndDropBy(src, x, y).perform();
	}
}