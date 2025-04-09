package mar7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Collection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com/men-tshirts");
		Thread.sleep(5000);
		driver.findElement(By.className("brand-more")).click();
		Thread.sleep(1000);
		List<WebElement> checkboxes =driver.findElements(By.xpath("//ul[@class='FilterDirectory-list']//following-sibling::li/label"));
		System.out.println("No of checkboxes:::"+checkboxes.size());
		for (WebElement each : checkboxes) {
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.quit();
		

	}

}