package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(1000);
			
			// switch to 1 st frame
			
			//driver.switchTo().frame(0);                     // by using index no of frame
			
			//driver.switchTo().frame("packageListFrame");   // by using string name present in frame path
			
			WebElement iframeshow=driver.findElement(By.xpath("//iframe[@src='overview-frame.html']"));
			driver.switchTo().frame(iframeshow);           // by using webelemnt 
			
			// findout web element path
			WebElement first=driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']"));
			first.click();
			Thread.sleep(2000);
			
			//we are in frame1 and 2nd element in 2nd frame so 1st we have to exit from 1st frame and reach on main page
			
			driver.switchTo().defaultContent();       
			
			//switch to 2nd frame from main page
			driver.switchTo().frame(1);
			
			//find 2nd element
			WebElement second=driver.findElement(By.xpath("//span[text()='Alert']"));
			second.click();
						
			driver.switchTo().defaultContent();
			
			//find and print total iframes on web page
			//total elements present in frame
			
			int noofiframes=driver.findElements(By.tagName("iframe")).size();
			System.out.println("noofiframes"+" "+noofiframes);
			
			
			
			
			

			
}
}