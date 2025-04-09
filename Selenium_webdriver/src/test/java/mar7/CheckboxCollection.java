package mar7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxCollection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		//get collection of checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//label[@class='css-label_c t_c']"));
		System.out.println("No of check boxes  "+checkboxes.size());
		for (WebElement each : checkboxes) {
			System.out.println(each.getText());
			}
		
		Thread.sleep(5000);
		driver.quit();
	}

}