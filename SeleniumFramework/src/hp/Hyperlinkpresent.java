package hp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinkpresent {public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.hp.com/in-en/home.html");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	List<WebElement> hyperlink = driver.findElements(By.tagName("a"));
	System.out.println(hyperlink.size());
	
	for(WebElement a:hyperlink)
	{
		System.out.println(a.getText());
	}
	driver.close();
	
	
}

}
