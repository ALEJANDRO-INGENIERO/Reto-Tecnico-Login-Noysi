package automatizacion;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automatizacion {
	
	public void logInIplanner(WebDriver driver, String url, String user, String passw) {
	        
	        try {
	            driver.get(url);
	            
	            System.out.println("Se ejecuta el caso login");
	
	            WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            
	            
	            //Inicio
	            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='boton-sup-login']"))).click();
	
	            TimeUnit.SECONDS.sleep(6);
	            
	            // User
	            eWait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
	            driver.findElement(By.name("username")).sendKeys(user);
	
	            // Password
	            eWait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
	            driver.findElement(By.name("password")).sendKeys(passw);
	            
	            // Boton de inicio de sesion
	            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='boton-iniciar']"))).click();
	            
	            TimeUnit.SECONDS.sleep(6);
	
	            System.out.println("Termina correctamente la ejecucion del caso login");
	
	        } catch (Exception e) {
	        	System.out.println("Error:\n"+e.getMessage());
	            e.getStackTrace();
	        }
	   }
	
	
	public void logOutIplanner(WebDriver driver) {
        
        try {
            
            System.out.println("Se ejecuta el caso logout");

            WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            //Logout
            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/app-root[1]/app-iplanner-root[1]/div[1]/div[1]/app-sidebar[1]/aside[1]/div[1]/div[3]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/mat-panel-title[1]"))).click();
            TimeUnit.SECONDS.sleep(5);

            System.out.println("Termina correctamente la ejecucion del caso logout");

        } catch (Exception e) {
        	System.out.println("Error:\n"+e.getMessage());
            e.getStackTrace();
        }
   }
	
	
	public void campaing(WebDriver driver) {
        
        try {
        	
        	System.out.println("Se ejecuta el caso campaña");

            WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            //Desplegar opcion campaña
            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/app-root[1]/app-iplanner-root[1]/div[1]/div[1]/app-sidebar[1]/aside[1]/div[1]/div[3]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/mat-panel-title[1]"))).click();
            
            //Opcion campaña
            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/app-root[1]/app-iplanner-root[1]/div[1]/div[1]/app-sidebar[1]/aside[1]/div[1]/div[3]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/a[1]"))).click();
            TimeUnit.SECONDS.sleep(6);
            
            //Pestaña crecimiento
            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='mat-tab-label-0-1']"))).click();
            TimeUnit.SECONDS.sleep(6);
            
            //Pestaña diferencias
            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='mat-tab-label-0-2']"))).click();
            
            //Alerta
            eWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]")));
            driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
            TimeUnit.SECONDS.sleep(6);
            
            //Pestaña paginacion
            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='mat-tab-label-0-3']"))).click();
            TimeUnit.SECONDS.sleep(6);
            
            //Pestaña consolidado
            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='mat-tab-label-0-0']"))).click();
            TimeUnit.SECONDS.sleep(6);
            
            
            System.out.println("Termina correctamente la ejecucion del caso campaña");

        } catch (Exception e) {
        	System.out.println("Error:\n"+e.getMessage());
            e.getStackTrace();
        }
   }
	
	
	
	public void Evolution(WebDriver driver) {
        
        try {
        	
        	System.out.println("Se ejecuta el caso evolucion");
        	
            WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            //Desplegar opcion campaña
            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/app-root[1]/app-iplanner-root[1]/div[1]/div[1]/app-sidebar[1]/aside[1]/div[1]/div[3]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/mat-panel-title[1]"))).click();
            
            //Opcion evolucion
            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/app-root[1]/app-iplanner-root[1]/div[1]/div[1]/app-sidebar[1]/aside[1]/div[1]/div[3]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[2]/a[1]"))).click();
            TimeUnit.SECONDS.sleep(8);
            
            //Pestaña detalles SKU
            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='mat-tab-label-2-1']"))).click();
            TimeUnit.SECONDS.sleep(6);
            
            //Pestaña Generales
            eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='mat-tab-label-2-0']"))).click();
            TimeUnit.SECONDS.sleep(6);
            
            System.out.println("Termina correctamente la ejecucion del caso evolucion");

        } catch (Exception e) {
        	System.out.println("Error:\n"+e.getMessage());
            e.getStackTrace();
        }
   }
}
