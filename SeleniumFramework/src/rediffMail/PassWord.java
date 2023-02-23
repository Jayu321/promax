package rediffMail;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class PassWord {public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.rediff.com/");
	
	Thread.sleep(1000);
	
	/*WebElement CreateAcc= driver.findElement(By.xpath("//a[text()='Create Account']"));
	CreateAcc.click();
	Thread.sleep(1000);
	WebElement Password= driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	Password.sendKeys("Jayesh");
	Thread.sleep(1000);
	WebElement Repassword= driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	Repassword.sendKeys("Jayesh");
	Thread.sleep(1000);*/
	
	WebElement createacc= driver.findElement(By.xpath("//a[text()='Create Account']"));
	createacc.click();
	createacc.sendKeys("hddhfg");
	createacc.clear();
	createacc.submit();
	String msg=createacc.getTagName();
    System.out.println(msg);
    
   String text=  createacc.getText();
   System.out.println(text);
   
  String attributevalue= createacc.getAttribute("Attributename");
  System.out.println(attributevalue);
  
 TakesScreenshot t= (TakesScreenshot)driver;
 File f=t.getScreenshotAs(OutputType.FILE);
 File d = new File("C:\\Users\\Admin\\Pictures\\jayesh.jpeg");
 FileHandler.copy(f, d);
 
 JavascriptExecutor ref = (JavascriptExecutor)driver;
 ref.executeScript("window.scroolby(0,-2000)");
  
}
}