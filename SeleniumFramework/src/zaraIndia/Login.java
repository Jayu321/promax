package zaraIndia;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login {public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.zara.com/in/");

	Thread.sleep(1000);

	WebElement login= driver.findElement(By.xpath("//span[text()='LOG IN']"));
	login.click();

	Thread.sleep(1000);
	
	WebElement createacc= driver.findElement(By.xpath("//span[text()='CREATE ACCOUNT']"));
	createacc.click();
	Thread.sleep(1000);
	
	WebElement name1= driver.findElement(By.xpath("//input[@name='firstName']"));
	
	String selecttagname=name1.getTagName();
	System.out.println(selecttagname);
	
	WebElement name= driver.findElement(By.xpath("//input[@name='firstName']"));
	name.sendKeys("Jayesh");
	Thread.sleep(1000);

	WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("Ja@123456");
	Thread.sleep(1000);
	
	WebElement repeatpassword= driver.findElement(By.xpath("//input[@name='passwordConfirm']"));
	repeatpassword.sendKeys("Ja@123456");
	Thread.sleep(1000);
	
	WebElement pincode= driver.findElement(By.xpath("//input[@aria-autocomplete='list']"));
	pincode.sendKeys("394210");
	Thread.sleep(1000);
	
	WebElement state= driver.findElement(By.xpath("//select[@name='stateCode']"));

	Select s=new Select(state);

	//s.selectByValue("INGJ");
	//s.selectByIndex(0);
	s.selectByVisibleText("GUJARAT");
	
	WebElement locality= driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	locality.sendKeys("udhna");
	Thread.sleep(1000);

	
	WebElement address= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	address.sendKeys("laxminagar udhna");
	Thread.sleep(1000);
	
	WebElement city= driver.findElement(By.xpath("(//input[@type='text'])[6]"));
    city.sendKeys("surat");
    
    WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
	email.sendKeys("sonawanejayesh255@gmail.com");
	Thread.sleep(1000);
	
	WebElement mobile= driver.findElement(By.xpath("(//input[@type='tel'])[2]"));
	mobile.sendKeys("7016276219");
	Thread.sleep(1000);
    
	WebElement checkbox= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	checkbox.click();
	 
	WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	checkbox2.click();
	
	
	
	
	
    
    
    
    
    
    
    
}

}
