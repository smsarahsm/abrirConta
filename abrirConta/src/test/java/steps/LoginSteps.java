package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.Login;

public class LoginSteps {

    private static Login login = new Login();

    @Given("^que abra o site do Banco Original$")
    public void queAbraoSitedoBancoOriginal() {
        login.abrirPagina();
    }
    
    @When("^selecionar Abrir Nova Conta$")
    public void selecionarAbrirNovaConta() {
        login.selecionarAbrirNovaConta();
    }
    
    @And("^selecionar Para Você$")
    public void selecionarParaVocê() {
    	login.selecionarParaVocê();
        
    }
    
    @And("^preencher Campos$")
    public void preencherCampos() {
    	login.preencherCampos();
    	login.validarMsgErro();
        
    }
}
    
