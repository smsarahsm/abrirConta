package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FuncoesBrower {
	
	private static WebDriver driver;
	
	public void clicar(WebElement elemento) {
		elemento.click();
    }
	
	public void escrever(WebElement elemento, String texto) {
		elemento.sendKeys(texto);		
	}
	  
	public boolean existsElement(String id) { 
		try {
	         driver.findElement(By.id(id)); 
	         return true;
	     }catch (NoSuchElementException e){ 
	        	 return false; 
	     }
	}

}
