package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Account {public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.javatpoint.com/selenium-webdriver-drag-and-drop");
	
	Thread.sleep(1000);
	
	 WebElement prev=driver.findElement(By.xpath("(//a[@class='next'])[2]"));
	 WebElement searchbar=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	 
	 Actions act = new Actions(driver);
	 
	 act.dragAndDrop(prev, searchbar).perform();
	 
	
	 
	
	/*WebElement createaccount=driver.findElement(By.xpath("(//a[@role='button'])[3]"));
	createaccount.click();
	Thread.sleep(1000);

	
	
	WebElement custom=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	WebElement pronoun=driver.findElement(By.xpath("//select[@name=\"preferred_pronoun\"]"));
	boolean result = pronoun.isDisplayed();
	if(result==true)
	{
		System.out.println(result);
		System.out.println("is diplayed");
	}
	else
	{
		System.out.println(result);
		System.out.println("IS NOT DISPLAYED");
		custom.click();
	}
	
	result=pronoun.isDisplayed();
	System.out.println(result);*/
	
}

}
