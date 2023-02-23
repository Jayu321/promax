package browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowser {public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\Downloads\\IEDriverServer_x64_4.8.0\\IEDriverServer.exe");

	InternetExplorerDriver driver = new InternetExplorerDriver();
	
	driver.get("https://www.selenium.dev/downloads/");
	driver.manage().window().maximize();


}

}
