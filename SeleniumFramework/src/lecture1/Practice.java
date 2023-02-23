package lecture1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(1000);
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	String Title=driver.getTitle();
	System.out.println(Title);
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.manage().window().minimize();
	Thread.sleep(1000);
	
	Dimension d=new Dimension(200,300);
	driver.manage().window().setSize(d);
	Thread.sleep(1000);
	
	Point p = new Point (50,100);
	driver.manage().window().setPosition(p);
	
	Thread.sleep(1000);
	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(1000);
	
	driver.navigate().back();
	Thread.sleep(1000);
	
	driver.navigate().forward();
	Thread.sleep(1000);
	
	driver.navigate().refresh();
	Thread.sleep(1000);
	
	
	

}
}