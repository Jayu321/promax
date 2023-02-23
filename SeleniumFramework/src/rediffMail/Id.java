package rediffMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.rediff.com/");
	
	Thread.sleep(1000);
	
	WebElement CreateAcc= driver.findElement(By.xpath("//a[text()='Create Account']"));
	CreateAcc.click();
	Thread.sleep(1000);
	
	WebElement Id= driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
	Id.sendKeys("Jayesh");
	Thread.sleep(1000);
	
	
	WebElement CheckAvailability= driver.findElement(By.xpath("//input[@class='btn_checkavail']"));
	CheckAvailability.click();
	
	Thread.sleep(1000);
	
	WebElement RadioButton= driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));

	//RadioButton.click();
	boolean result = RadioButton.isSelected();
	if (result==true)
	{
		System.out.println(result);
		System.out.println("selected");
	}
	
	else
	{
		System.out.println(result);
		System.out.println("Not selected");
		RadioButton.click();
	}
	
	result =RadioButton.isSelected();
	System.out.println(result);
	
	
	
}

}
