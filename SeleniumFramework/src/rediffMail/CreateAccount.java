package rediffMail;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.rediff.com/");
	
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	
	String Title = driver.getTitle();
	System.out.println(Title);
	
	/*driver.manage().window().minimize();
	driver.manage().window().maximize();
	
	
	Dimension d= new Dimension(200,300);
	driver.manage().window().setSize(d);
	
	Point p = new Point(100,200);
	driver.manage().window().setPosition(p);
	
	driver.navigate().to(currenturl);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();*/
	
	WebElement CreateAcc= driver.findElement(By.xpath("//a[text()='Create Account']"));
	
	String text = CreateAcc.getText();
	System.out.println(text);
	String attribute = CreateAcc.getAttribute("title");
	System.out.println(attribute);
	
	CreateAcc.click();
			
}

}
