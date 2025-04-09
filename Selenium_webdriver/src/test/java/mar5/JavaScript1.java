package mar5;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript1 {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//create obejct for jaascriptExecutor
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//launch url ussing java script
		js.executeScript("window.location='https://flipkart.com'");
		Thread.sleep(5000);
		//print title and length of title
		String ppagetitle =js.executeScript("return document.title").toString();
		System.out.println(ppagetitle);
		System.out.println(ppagetitle.length());
		//print url and length of url
		String strUrl =js.executeScript("return document.URL").toString();
		System.out.println(strUrl);
		System.out.println(strUrl.length());
		//print domain name and length of domain
		String strdomain =js.executeScript("return document.domain").toString();
		System.out.println(strdomain);
		System.out.println(strdomain.length());
		driver.quit();
		}
}


