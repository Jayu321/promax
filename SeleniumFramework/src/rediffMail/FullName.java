package rediffMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullName {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		WebElement CreateAcc= driver.findElement(By.xpath("//a[text()='Create Account']"));
		CreateAcc.click();
		
		WebElement Fullname= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Fullname.sendKeys("jayesh sonawane");
		
		String Attribute=Fullname.getAttribute("style");
		System.out.println(Attribute);
		
}

}
