package cases;

import org.openqa.selenium.WebDriver;

import automatizacion.automatizacion;
import setting.SeleniumSetting;

public class Cases {
	SeleniumSetting seleniumSetting;
	WebDriver driver;
	String url;
	
	public void initializer() {
		seleniumSetting = new SeleniumSetting();
        driver = seleniumSetting.generateDriver();
        url = "https://iplanner-qa.leonisa.com/#/landing";
    }
	
	public void caseCampaign(String user, String passw) {
        this.initializer();
        automatizacion automati = new automatizacion();
        
        automati.logInIplanner(driver, url, user, passw);
        automati.campaing(driver);
        automati.logOutIplanner(driver);
        
        driver.quit();
    }
	
	public void caseEvolution(String user, String passw) {
        this.initializer();
        automatizacion automati = new automatizacion();
        
        automati.logInIplanner(driver, url, user, passw);
        automati.Evolution(driver);
        automati.logOutIplanner(driver);
        
        driver.quit();
    }
}
