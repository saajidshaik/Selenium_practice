package feb24;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Using_Location {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//get sigin element location
		WebElement element = driver.findElement(By.xpath("(//a[@class='a-button-text'])[2]"));
		//create object for point class
		Point point = element.getLocation();
		System.out.println("X cordinate : " + point.getX() + "Y cordinate: " + point.getY());
		//click sigin button
		Thread.sleep(5000);
	element.click();
	}
}