package phptravels;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildData {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://phptravels.org/login");
			Thread.sleep(1000);
			
			WebElement fb=driver.findElement(By.xpath("(//li[@class='list-inline-item'])[1]"));
			fb.click();
			Thread.sleep(1000);
			
			WebElement insta=driver.findElement(By.xpath("(//li[@class='list-inline-item'])[2]"));
			insta.click();
			Thread.sleep(1000);
			
			String addres=driver.getWindowHandle();
			System.out.println(addres);
			
			ArrayList<String> child = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(child.get(1));
			driver.getCurrentUrl();
			System.out.println(child);
			
		}
}
