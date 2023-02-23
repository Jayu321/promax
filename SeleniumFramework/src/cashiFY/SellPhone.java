package cashiFY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SellPhone {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.cashify.in/");
	
	Thread.sleep(3000);
	
	WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
	search.sendKeys("watch");
	Thread.sleep(3000);
	
	WebElement product = driver.findElement(By.xpath("//li[@id='pd-list-search-0header']"));
	search.click();
	Thread.sleep(3000);
	
	
	WebElement dynamic = driver.findElement(By.xpath("(//div[@id='__next']//img)[5]"));
	dynamic.click();
	Thread.sleep(3000);
	
	WebElement apple = driver.findElement(By.xpath(""));
	System.out.println(apple.getText());
	
	
	
	
	
	
	
	
	
	
	
}

}
