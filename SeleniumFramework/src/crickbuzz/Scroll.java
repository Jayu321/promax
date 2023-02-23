package crickbuzz;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(2000);
		
		JavascriptExecutor ref = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		ref.executeScript("window.scrollby(0,3000)");
		

		
}
}