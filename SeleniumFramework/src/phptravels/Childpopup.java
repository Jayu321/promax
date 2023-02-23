package phptravels;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup {public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://phptravels.org/login");
	Thread.sleep(1000);
	
	WebElement whatsapp=driver.findElement(By.xpath("(//a[@class='btn btn-icon mb-1'])[5]"));
    whatsapp.click();
	Thread.sleep(1000);
	
	WebElement insta=driver.findElement(By.xpath("(//a[@class='btn btn-icon mb-1'])[2]"));
	insta.click();
	Thread.sleep(1000);
	
	WebElement facebook=driver.findElement(By.xpath("(//a[@class='btn btn-icon mb-1'])[1]"));
	facebook.click();
	Thread.sleep(1000);
	
	//child browser popup
	
	String mainbrowser=driver.getWindowHandle();           //address of main browser page
	System.out.println(mainbrowser);
	
	//Set<String> add=driver.getWindowHandles();
     ArrayList<String> add1 = new ArrayList<String>(driver.getWindowHandles());
	
	String a1=add1.get(0);
	String a2=add1.get(1);
	String a3=add1.get(2);
	String a4=add1.get(3);
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	
    driver.switchTo().window(a1);
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	
	driver.switchTo().window(a2);
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	
	driver.switchTo().window(a3);
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	
	driver.switchTo().window(a4);
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	
	//or
	/*ArrayList<String> address = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(address.get(1));
	System.out.println(driver.getCurrentUrl());*/
	
}

}
