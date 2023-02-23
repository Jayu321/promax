package instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(1000);
	
	WebElement signup=driver.findElement(By.xpath("//span[text()='Sign up']"));
	signup.click();
	Thread.sleep(1000);
	
	WebElement mobile=driver.findElement(By.xpath("//input[@autocomplete='tel']"));
	
	WebElement fullname=driver.findElement(By.xpath("//input[@name='fullName']"));
	
	WebElement username =driver.findElement(By.xpath("//input[@aria-label='Username']"));
	
	WebElement password =driver.findElement(By.xpath("//input[@aria-label='Password']"));
	
	WebElement signupbutton =driver.findElement(By.xpath("//button[text()='Sign up']"));
	
	boolean result=signupbutton.isEnabled();
	
	if(result==true)
	{
		System.out.println(result);
		System.out.println("button is enabled");
	}

	else
	{
		System.out.println(result);
		System.out.println("button is disabled");
		
		mobile.sendKeys("1234567890");
		fullname.sendKeys("Jayesh");
		username.sendKeys("Jack123");
		password.sendKeys("Ja@4563");
		
		signupbutton.click();
		
	}
	result=signupbutton.isEnabled();
	System.out.println(result);
}
}