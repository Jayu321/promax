package timesofindia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/?from=mdr");

		Thread.sleep(10000);

		WebElement login= driver.findElement(By.xpath("//span[text()='Sign In']"));
		login.click();
		
		WebElement email= driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
	
		
		WebElement continuebu= driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		
		boolean result = continuebu.isEnabled();
		if(result==true)
		{
			System.out.println(result);
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println(result);
			System.out.println("button is disabled");
			email.sendKeys("sonawanejayesh255@gmail.com");
			continuebu.click();
		}
		
		result=continuebu.isEnabled();
		System.out.println(result);

	
	}
	
		
}
