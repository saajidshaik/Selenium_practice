package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender3 {

	public static void main(String[] args) throws Throwable {
		String dob ="9/march/2029";
		String str[] =dob.split("/");
		String date =str[0];
		String month =str[1];
		String year= str[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flights.qedgetech.com/");
		driver.findElement(By.name("email")).sendKeys("ranga@qedgetech.com");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("search-date")).click();
		Thread.sleep(2000);
		//capture calender year
		String calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!calYear.equals(year)) {
			//click previous button
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		//capture calender month
		String calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calMonth.equalsIgnoreCase(month)) {
			//click previous button
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			List<WebElement> cols =eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date))
				{
					eachcell.click();
				}
			}
		}


	}

}