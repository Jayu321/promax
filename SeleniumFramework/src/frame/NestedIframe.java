package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframe {public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	Thread.sleep(1000);
	
	WebElement parentframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(parentframe);
	
	WebElement childframe=driver.findElement(By.xpath("//iframe[@id='frame3']"));
	driver.switchTo().frame(childframe);
	
	WebElement chekbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	chekbox.click();
	
	driver.switchTo().parentFrame();
	
	WebElement input=driver.findElement(By.tagName("input"));
	input.sendKeys("jayesh sonawane");
	
	driver.switchTo().defaultContent();
	
	WebElement secondframe=driver.findElement(By.xpath("//iframe[@id='frame2']"));
	driver.switchTo().frame(secondframe);
	
	
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
	Select s = new Select(dropdown);
	s.selectByVisibleText("Big Baby Cat");
	
	
	
	
	
	
	
	
}

}
