package e2e.steps;

import e2e.core.Core;
import e2e.pages.Cadastro;
import e2e.pages.Contact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class PassosCadastro extends Core {

    private Cadastro paginaCadastro;

    public PassosCadastro() {
        paginaCadastro = new Cadastro();
        PageFactory.initElements(driver, this.paginaCadastro);
    }
    @Given("o usuário esteja no site Buger Eats")
    public void o_usuario_esteja_no_site_buger_eats() {
    acessarPagina(paginaCadastro.getUrl());
    }
    @When("clicar no botão cadastre-se")
    public void clicar_no_botao_cadastre_se() {

    }
    @When("preencher os campos com dados válidos")
    public void preencher_os_campos_com_dados_validos() {

    }
    @Then("deve ser exibida uma mensagem de confirmação de cadastro")
    public void deve_ser_exibida_uma_mensagem_de_confirmacao_de_cadastro(){

    }
   }