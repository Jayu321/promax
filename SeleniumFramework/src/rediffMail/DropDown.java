package rediffMail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.rediff.com/");
	
	Thread.sleep(1000);
	
	WebElement CreateAcc= driver.findElement(By.xpath("//a[text()='Create Account']"));
	CreateAcc.click();
	Thread.sleep(1000);
	
	WebElement Dropdown= driver.findElement(By.xpath("//select[@id='country']"));

	Select ref = new Select(Dropdown);
	ref.selectByValue("65");
	
	List<WebElement>Alllist=ref.getOptions();
	System.out.println(Alllist.size());
	
	for(WebElement a :Alllist)
	{
		System.out.println(a.getText());
	}
	
	boolean result =ref.isMultiple();
	if(result==true)
	{
		System.out.println(result);
		System.out.println("dropdown is multiple");
	}
	else
	{
		System.out.println(result);
		System.out.println("not  multiple");
	}
	
	

	
}
}