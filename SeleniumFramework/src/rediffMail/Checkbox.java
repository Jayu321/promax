package rediffMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.rediff.com/");
	
	Thread.sleep(1000);
	
	WebElement CreateAcc= driver.findElement(By.xpath("//a[text()='Create Account']"));
	CreateAcc.click();
	Thread.sleep(1000);
	
	WebElement Chekbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
	WebElement Hidden= driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[1]"));
	
	boolean result=Hidden.isDisplayed();
	if (result==true)
	{
		System.out.println(result);
		System.out.println("button is displayed");
	}
	else
	{
		System.out.println(result);
		System.out.println("button is not displayed");
		Chekbox.click();
		Select s = new Select(Hidden);
		s.selectByIndex(3);
	}
	
	result=Chekbox.isDisplayed();
	System.out.println(result);
	
	
	

}
}