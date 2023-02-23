package toolsqa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
    Thread.sleep(2000);
	
	WebElement promptalert=driver.findElement(By.xpath("//button[@id='promtButton']"));
    promptalert.click();
    Thread.sleep(2000);
    
    
    
    Alert alt=driver.switchTo().alert();
    		alt.sendKeys("jayuu");
    		alt.dismiss();
    

    		WebElement re= driver.findElement(By.xpath(""));
    		driver.switchTo().frame(re);
    		
    		driver.switchTo().frame(0);
    		driver.switchTo().frame("gdg");
    		
    		driver.switchTo().defaultContent();
    		driver.switchTo().parentFrame();
}

}
