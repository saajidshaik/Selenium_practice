package feb20;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verify_Title {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://gmail.com");
		//suspend tool for 5 secs
		Thread.sleep(5000);
		String Expected_title= "google";
		//get title in run time
		String Actual_title = driver.getTitle();
		//verify expected title equals to actual title
		if(Actual_title.equalsIgnoreCase(Expected_title))
		{
			System.out.println("Title is Matching:::"+Expected_title+"     "+Actual_title);
		} 
		else
		{
			System.out.println("Title is Not Matching:::"+Expected_title+"     "+Actual_title);
		}
		driver.quit();
	}
}