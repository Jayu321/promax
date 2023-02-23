package accltd;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.acclimited.com/");
			Thread.sleep(1000);
			
			TakesScreenshot ref = (TakesScreenshot)driver;
			SimpleDateFormat mydate=new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
			Date d = new Date();
			String s1=mydate.format(d);
			File source = ref.getScreenshotAs(OutputType.FILE);
			File desti = new File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\Jyau"+s1+".png");
			
			FileHandler.copy(source, desti);
			


	
	
	
	}
	
}
