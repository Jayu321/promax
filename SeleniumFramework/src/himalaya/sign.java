package himalaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sign {public static void main(String[] args) throws InterruptedException {
	

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://himalayawellness.in/");
	
	Thread.sleep(1000);
	
	WebElement profilesymbol= driver.findElement(By.xpath("(//button[@class='pt-dropdown-toggle'])[2]"));
	profilesymbol.click();
	Thread.sleep(1000);
	
	WebElement signin= driver.findElement(By.xpath("(//span[text()='Sign In'])[2]"));
	signin.click();
	Thread.sleep(1000);

	WebElement email= driver.findElement(By.xpath("(//input[@type='email'])[1]"));
	email.sendKeys("sonawanejayesh255@gmail.com");
	Thread.sleep(1000);
	
	WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("Jayu@6219");
	Thread.sleep(1000);
	
	WebElement login= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	login.click();
	Thread.sleep(1000);
	
	WebElement frame = driver.findElement(By.xpath("(//iframe[@frameborder='none'])[5]"));
	driver.switchTo().frame(frame);
	
	WebElement product= driver.findElement(By.xpath("(//a[@href='/pages/search-results-page?collection=all'])[2]"));
	Thread.sleep(1000);
	product.click();
}
}