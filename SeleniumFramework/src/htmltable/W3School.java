package htmltable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	Thread.sleep(1000);
	
	List<WebElement> cells=driver.findElements(By.xpath("//table[@class='ws-table-all']//tr[5]//td"));
	
	int noofcell=cells.size();
	
	System.out.println(noofcell);
	
	
	/*WebElement c1=cells.get(0);
	System.out.println(c1.getText());
	WebElement c2=cells.get(1);
	System.out.println(c2.getText());
	WebElement c3=cells.get(2);
	System.out.println(c3.getText());    //18 times written to print its too long
	*/
	
	for(int i=0; i<noofcell; i++)
	{
		WebElement c=cells.get(i);
		System.out.println(c.getText());
	}
	
	
	

}
}