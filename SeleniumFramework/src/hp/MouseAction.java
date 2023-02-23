package hp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.hp.com/in-en/home.html");
	
	driver.manage().window().maximize();
	
	WebElement Explore = driver.findElement(By.xpath("(//span[@class='font-style-h5 '])[1]"));
	WebElement Monitor = driver.findElement(By.xpath("(//label[text()='Monitors'])[2]"));
	
	Actions act = new Actions(driver);
	
	/*act.moveToElement(Explore).perform();
	
	Thread.sleep(2000);
	act.moveToElement(Monitor).click().perform();*/

	act.moveToElement(Explore).moveToElement(Monitor).click().build().perform();

	
	

}
}