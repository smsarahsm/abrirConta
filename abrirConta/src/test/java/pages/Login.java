package pages;


import java.io.File;

import java.util.NoSuchElementException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login  {
	
	
    WebDriver driver = new ChromeDriver();

	public void abrirPagina() {
		driver.get("https://www.original.com.br/");
	}

	public void selecionarAbrirNovaConta() {
		driver.findElement(By.xpath("//div//a[@rel='abrir-nova-conta_desktop']")).click();

	}

	public void selecionarParaVocê() {
		driver.findElement(By.xpath("//a[@id='bt1']")).click();
	}

	public void preencherCampos() {
		driver.findElement(By.id("nome")).sendKeys("Vanessa Mariah das Neves");
		driver.findElement(By.id("telefone")).sendKeys("64998478019");
		driver.findElement(By.id("email")).sendKeys("vanessamariahdasnevesyahoo.se");
		driver.findElement(By.id("cpf")).sendKeys("24636054806");
	}

	
	public void validarMsgErro() { 
		if (existsElement("emailMsgErrorInvalid")) {
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  Date data = new Date(); try { FileUtils.copyFile(scrFile, new File(
	  "C:\\Users\\Sara\\eclipse-workspace\\abrirConta\\src\\test\\resources\\print"
	  + data + ".jpg"),true); } catch (IOException e) { e.printStackTrace(); } } }
	  
	  
	  
	private boolean existsElement(String id) { try {
	  driver.findElement(By.id(id)); } catch (NoSuchElementException e) { return
	  false; } return true; }
	  
	  
} 
