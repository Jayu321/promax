package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Advanced {public static void main(String[] args) throws InterruptedException {System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.ebay.com/");

WebElement advanced = driver.findElement(By.xpath("//a[@title='Advanced Search']"));
advanced.click();

WebElement keyword = driver.findElement(By.xpath("//select[@name='_in_kw']"));

Select s=new Select(keyword);

s.selectByValue("2");
//s.deselectByVisibleText("Exact words, any order");

WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
boolean result=checkbox.isSelected();
if(result==true)
{
	System.out.println(result);
	System.out.println("element is selected");
}
else
{
	System.out.println(result);
	System.out.println("element is not selected");
	checkbox.click();
}
result=checkbox.isSelected();
System.out.println(result);

}
}