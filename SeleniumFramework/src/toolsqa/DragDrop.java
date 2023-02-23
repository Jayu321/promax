package toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
    Thread.sleep(2000);
    
    WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
    WebElement drop= driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
    
    Actions ref=new Actions(driver);
    
    ref.dragAndDrop(drag, drop).build().perform();
 
    
    
    
   
	
	
    
    
    
    
}
}
