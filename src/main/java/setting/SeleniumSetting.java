package setting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumSetting {
	public WebDriver generateDriver() {
		
		 WebDriver driver = null;
		 ChromeOptions chromeOptions = new ChromeOptions();
		 
	        try {
	                System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	                driver = new ChromeDriver(chromeOptions);
	                
	                //Maximizar la ventana
	                driver.manage().window().maximize();

	        } catch (Exception e) {
	             e.getMessage();
	        }
		
		return driver;
	}
}
