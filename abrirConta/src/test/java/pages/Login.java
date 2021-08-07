package pages;


import java.io.File;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;



public class Login extends FuncoesBrower  {
	
	@FindBy(xpath ="//div//a[@rel='abrir-nova-conta_desktop']")
	private WebElement btnAbrirConta;
	@FindBy(xpath ="//a[@id='bt1']")
	private WebElement btnParaVC;
	@FindBy(id ="nome")
	private WebElement cmpNome;
	@FindBy(id ="telefone")
	private WebElement cmpTelefone;
	@FindBy(id ="email")
	private WebElement cmpEmail;
	@FindBy(id ="cpf")
	private WebElement cmpCpf;
	@FindBy(xpath ="//div//input[@disabled='disabled']")
	private WebElement btnEnviarDes;
	
    WebDriver driver = new ChromeDriver();

	public void abrirPagina() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarahmoreira\\Documents\\gitgit\\abrirConta\\abrirConta\\src\\test\\resources\\chromedriver");
		driver.get("https://www.original.com.br/");
	}

	public void selecionarAbrirNovaConta() {
		clicar(btnAbrirConta);

	}

	public void selecionarParaVocê() {
		clicar(btnParaVC);
	}

	public void preencherCampos() {
		escrever(cmpNome, "Vanessa Mariah das Neves");
		escrever(cmpTelefone, "64998478019");
		escrever(cmpEmail, "vanessamariahdasnevesyahoo.se");
		escrever(cmpCpf,"24636054806");
	}
	
	public void validarCamposPreenchidos() { 
		if (existsElement("//div//input[@disabled='disabled']")== true) {
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Date data = new Date(); 
	    try { 
		    FileUtils.copyFile(scrFile, new File("print" + data + ".jpg"),true); 
		} 
	    catch (IOException e) {
	    	e.printStackTrace(); } } 
	}
	
		

} 
