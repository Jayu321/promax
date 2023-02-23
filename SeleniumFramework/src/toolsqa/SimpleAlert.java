package toolsqa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
    Thread.sleep(2000);
    
    WebElement simplealert= driver.findElement(By.xpath("(//button[@type='button'])[2]"));
    simplealert.click();
    
    Thread.sleep(2000);
    
    String msg = driver.switchTo().alert().getText();
    System.out.println(msg);
    
    Alert ref = driver.switchTo().alert();
    ref.accept();
    
    //or
   // driver.switchTo().alert().accept();
    
    
    // confirm alert
    
    
    WebElement confirmalert=driver.findElement(By.xpath("(//button[@type='button'])[4]"));
    confirmalert.click();
    Thread.sleep(2000);
    
    String text=driver.switchTo().alert().getText();
    System.out.println(text);
    
    driver.switchTo().alert().dismiss();
    Thread.sleep(2000);
}


}
