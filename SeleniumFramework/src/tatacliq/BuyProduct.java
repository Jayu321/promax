package tatacliq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.tatacliq.com/");
	
	Thread.sleep(3000);
	
	WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
	search.sendKeys("shirt");

	Thread.sleep(3000);
	WebElement search1 = driver.findElement(By.xpath("(//div[@class='SearchPage__back'])[1]"));
	search1.click();
	Thread.sleep(10000);
	

	WebElement dynamic = driver.findElement(By.xpath("(//div[@id='grid-wrapper_desktop']//div)[6]"));
	dynamic.click();
	 Thread.sleep(3000);
	
	WebElement shirtprice = driver.findElement(By.xpath("(//div[@id='grid-wrapper_desktop']//div)[29]"));
	
	System.out.println(shirtprice.getText());
	Thread.sleep(3000);
	
	

	
	

}
}