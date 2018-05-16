package configuracao;

import org.openqa.selenium.WebDriver;

public class Config {

	public static WebDriver driver;

	public String txtAplicao = null;
	public String txtCadastro = null;
	
	public String idCampoUsuario = "username";
	public String idCampoSenha = "password";
	public String xpathBtnAcessar = "/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[1]/div[2]/div/form/input";

	// Acesso para o browser Chrome
	public String pathChromeServer = "resources\\chromedriver\\chromedriver.exe";

	public static String idBtnLupa = "btPesquisarPropostaCnpj";
	public static String idCampoCNPJ = "inlineFormInputGroup";
	public static String idBtnConfirmaCad = "(//button[@id='btAbreProposta'])[2]";

	public static String nomeCampoRazaoSocial = "razaoSocial";
	public static String nomeCampoNomeFantasia = "nomeFantasia";
	public static String nomeCampoDataFundacao = "dataFundacao";
	public static String nomeCampoEmailDadosCadastrais = "emaildadoscadastrais";
	public static String idCampoTelefone = "telefone";
	public static String xpathBoxEmpresa = "//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[2]/button";
	public static String xpathBtnEditarEmpresa = "//*[@id=\"formInfoCadastrais\"]/div[2]/div/button";

	public static String idCampoCEP = "cep";
	public static String idCampoEndereco = "endereco";
	public static String idCampoComplemento = "complemento";
	public static String xpathSalvarEndereco = "//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[2]/button";
	public static String xpathEditarEndereco = "//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[1]/div[3]/div/div[2]/div/button";

	public static String nomeCampoNomeSocio = "nome";
	public static String nomeCampoCpf = "cpf";
	public static String nomeCampoParticipacao = "participacao";
	public static String nomeCampoDataNascimento = "dataNascimento";
	public static String xpathCampoTelefoneSocio = "//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[2]/div[3]/div/div/div[1]/form/div[2]/div[6]/div/input";
	public static String nomeCampoEmail = "email";
	public static String xpathBtnSalvaSocio = "//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/button";
	public static String xpathEditaSocio = "//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/button";

	public static String idCampoCNAE = "input-cnae-desc";
	public static String idCampoFaturamento = "valorFaturamento";
	public static String idFormPrevisaoVenda = "exampleFormControlSelect1";

	public static String xpathClassePlanos = "//*[@id=\"pills-padrao\"]/div/div/div[2]/div[1]/isnotcontratado/div";

	public static String xpathQtdPOSComFio = "//*[@id=\"pills-gprs-cf\"]/div/div[4]/input";
	public static String xpathAddPOSComFio = "//*[@id=\"pills-gprs-cf\"]/button";
	public static String xpathCarrinhoPOScomFio = "//*[@id=\"elCarrinhoArea\"]/div[2]/solucoes/div/div[2]/div[2]/div/div[2]/input";

	public static String xpathQtdPOSSemFio = "//*[@id=\"pills-gprs-sf\"]/div/div[4]/input";
	public static String xpathAddPOSemFio = "//*[@id=\"pills-gprs-sf\"]/button";
	public static String xpathCarrinhoPOSsemFio = "//*[@id=\"elCarrinhoArea\"]/div[2]/solucoes[2]/div/div[2]/div[2]/div/div[2]/input";

	public static String xpathQtdPOSMobile = "//*[@id=\"pills-gprs-mob\"]/div/div[4]/input";
	public static String xpathAddPOSMobile = "//*[@id=\"pills-gprs-mob\"]/button";
	public static String xpathCarrinhoPOSMobile = "//*[@id=\"elCarrinhoArea\"]/div[2]/solucoes[3]/div/div[2]/div[2]/div/div[2]/input";

	public static String xpathSelectBandeira = "//*[@id=\"exampleSelect1\"]";
	public static String idCampoBanco = "cboBanco";
	public static String idCampoCodBanco = "cboBanco";
	public static String idCampoAgencia = "agencia";
	public static String nomeCampoConta = "conta";
	public static String xpathAddDomicilioBanc = "//*[@id=\"centralizar-nao\"]/div[2]/fieldset[1]/form/fieldset/div/div[2]/div[2]/button";

	public static String xpathCampoEmailCred = "//*[@id=\"CorpoProposta\"]/div[7]/div[2]/form/fieldset/div/div[1]/div[1]/div/input";
	public static String xpathReceptor = "//*[@id=\"CorpoProposta\"]/div[7]/div[2]/form/fieldset/div/div[1]/div[2]/div/input";
	public static String xpathObervacoes = "//*[@id=\"exampleFormControlTextarea1\"]";
	public static String xpathBtnEnviarProposta = "//*[@id=\"form-enviar-proposta\"]/button";

	public static String xpathFade = "/html/body/div[2]";

	public static String XpathAlerta = "//*[@id=\"CorpoProposta\"]/div[10]/div[2]/div[2]/p";

	public static String textoMsgSucesso = "sucesso";

}
