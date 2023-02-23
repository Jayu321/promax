package keyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		Thread.sleep(1000);
		
		WebElement textbox1=driver.findElement(By.id("inputText1"));
		textbox1.sendKeys("my name is jayesh");
		
		WebElement textbox2=driver.findElement(By.id("inputText2"));
	
		Actions act=new Actions(driver);
		
		//ctrl+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//ctrl+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("x");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//tab press
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//ctrl+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		
		
	}

}
