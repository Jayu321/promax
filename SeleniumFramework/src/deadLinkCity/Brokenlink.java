package deadLinkCity;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	
	WebDriver driver = new ChromeDriver();

	//driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("http://www.deadlinkcity.com/");
	
	List<WebElement> list = driver.findElements(By.tagName("a"));
	
	System.out.println(list.size()+"total link on page");
	
	int responsecode = 200 ;   // for valid link
	
	int brokenlinkscount= 0;
	
	for(WebElement a : list)
	{
		String url =a.getAttribute("href");
		URL urllink = new URL(url);
		
		HttpURLConnection http = (HttpURLConnection)urllink.openConnection();
		
		http.setRequestMethod("head");
		http.connect();
		responsecode=http.getResponseCode();
		
		if(responsecode >=400)
		{
			System.out.println(url+"brokenlink");
			brokenlinkscount ++;
			
		}
		
	}

	System.out.println("brokenlinkscount");
	
	
}

}
