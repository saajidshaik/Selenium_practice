package feb24;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetHeightWidth {
	public static void main(String[] args) throws Throwable {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//get height and width of username textbox
		WebElement  username = driver.findElement(By.name("txtUsername"));
		//create object for dimension class
		Dimension dim = username.getSize();
		System.out.println(dim.height+"    "+dim.width);
		//get height and width of login button
		WebElement loginbtn = driver.findElement(By.name("Submit"));
		//create object for dimension class
		Dimension dim1 = loginbtn.getSize();
		System.out.println(dim1.height+"    "+dim1.width);
		driver.quit();
		}
}