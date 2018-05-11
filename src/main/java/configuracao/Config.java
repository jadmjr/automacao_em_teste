package configuracao;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;

public class Config {

	public static WebDriver driver;

	public String txtAplicao = null;
	public String txtCadastro = null;

	// Acesso para o browser Chrome
	public String pathChromeServer = "resources\\chromedriver\\chromedriver.exe";

	public String camTexto = "//*[@id=\"divHeader\"]/div[2]/div[3]/div/span[1]";
	public String camCNPJ = "//*[@id=\"inlineFormInputGroup\"]";
	public String camBtnLupa = "btPesquisarPropostaCnpj";
	public String camConfNVProsp = "btAbreProposta";
	public String camTextoCadasto = "//*[@id=\"titulo-cadastro\"]/h1";
	public String camEditEmpresa = "//*[@id=\"formInfoCadastrais\"]/div[2]";

	public String camCampRazaoSocial = "//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[1]/div[2]/div/div[1]/form/div[1]/div[2]/div/input";
	public String camCampNomeFantasia = "//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[1]/div[2]/div/div[1]/form/div[2]/div[1]/div/input";
	public String camCampDataFundacao = "//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[1]/div[2]/div/div[1]/form/div[2]/div[3]/div/input";
	public String camCampEmail = "//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[1]/div[2]/div/div[1]/form/div[3]/div[1]/div/input";
	public String camCampTelefone = "//*[@id=\"telefone\"]";
	public String camCampBtnSalvar = "//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[2]/button/i";

}
