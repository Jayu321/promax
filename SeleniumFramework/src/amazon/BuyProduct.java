package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BuyProduct {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(1000);
	
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("watch");
	Thread.sleep(3000);

	WebElement product= driver.findElement(By.xpath("(//div[@class='s-suggestion-container'])[1]"));
	product.click();
	Thread.sleep(3000);
	
	
	WebElement dynamic= driver.findElement(By.xpath("(//span[@data-component-id='35']//div)[75]"));
	dynamic.click();
	Thread.sleep(2000);
	

	WebElement price= driver.findElement(By.xpath("(//span[@data-component-id='35']//div)[80]"));
   System.out.println(price.getText());
	Thread.sleep(1000);
}
}