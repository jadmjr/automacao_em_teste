package teste.passos;

import static org.junit.Assert.fail;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import configuracao.Config;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class CRED01 extends Config {

	// Acessar o browser e preencher a url do sistema e acessar o sistema

	@Dado("^o browser \"(.*?)\" inserir a url \"([^\"]*)\" da aplicação$")
	public void acessarAplicacao(String browser, String url) throws Exception {
		try {
			Thread.sleep(1000);
			if (browser.equals("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				System.setProperty("webdriver.chrome.driver", pathChromeServer);
				driver = new ChromeDriver(options);
				driver.get(url);
			}
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Entao("^confirmada a abertura da pagina atraves do titulo \"([^\"]*)\"$")
	public void acesso(String texto) throws Exception {
		try {
			Thread.sleep(1000);
			Assert.assertEquals(driver.getTitle(), texto);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		} catch (AssertionError e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^preencher cnpj\"([^\"]*)\"$")
	public void InserirCPNJ(String cnpj) {
		try {
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement campoCNPJ = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idCampoCNPJ)));

			campoCNPJ.sendKeys(cnpj);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^clicar no botão lupa$")
	public void clicarLupa() {
		try {
			Thread.sleep(1000);
			driver.findElement(By.id(idBtnLupa)).click();

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@E("confirmar a inserção de um novo cadastro$")
	public void confirmarNovoCadastro() throws Exception {
		try {
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(idBtnConfirmaCad))).click();
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Entao("^verificar se a tela está aberta pelo campo razao social$")
	public void AbrirTelaNovoCadastro() {
		try {
			Thread.sleep(1000);
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement fade = driver.findElement(By.xpath(xpathFade));
				js.executeScript("$('.modal-backdrop').remove()", fade);

			} catch (NoSuchElementException e) {
				// IGNORANDO EXPEPTION
			}
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement campoRazaoSocial = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.name(nomeCampoRazaoSocial)));

			Assert.assertNotNull(campoRazaoSocial);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^a razão Social:\"([^\"]*)\"$")
	public void PrecherRazaoSocial(String razaoSocial) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.name(nomeCampoRazaoSocial)).sendKeys(razaoSocial);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^o Nome fantasia:\"([^\"]*)\"$")
	public void PrecherNomeFantasia(String nomeFantasia) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.name(nomeCampoNomeFantasia)).sendKeys(nomeFantasia);
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^a Data de fundação:\"([^\"]*)\"$")
	public void PrecherDtFundacao(String dtfundacao) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.name(nomeCampoDataFundacao)).sendKeys(dtfundacao);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^preecher o Email:\"([^\"]*)\"$")
	public void PrecherEmail(String email) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.name(nomeCampoEmailDadosCadastrais)).sendKeys(email);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^o Telefone:\"([^\"]*)\"$")
	public void precherTelefoneEmpresa(String telefone) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.id(idCampoTelefone)).sendKeys(telefone);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Entao("^Verificar se a tela exibe a box com os dados da empresa salvos$")
	public void ValidarBoxEmpresa() {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(xpathBoxEmpresa)).click();

			WebElement btnEditar = driver.findElement(By.xpath(xpathBtnEditarEmpresa));
			Assert.assertNotNull(btnEditar);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^o cep\"([^\"]*)\"$")
	public void preencherCep(String cep) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.id(idCampoCEP)).sendKeys(cep);
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^o numero \"([^\"]*)\"$")
	public void preencherNumero(String numero) throws Throwable {
		try {
			Thread.sleep(1000);
			WebElement campoEndereco = driver.findElement(By.id(idCampoEndereco));
			// JMJR - ESPERANDO WS
			campoEndereco.click();
			Thread.sleep(1000);
			campoEndereco.sendKeys(campoEndereco.getText() + " , " + numero);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^o complemento \"([^\"]*)\"$")
	public void preencherComplemento(String complemento) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.id(idCampoComplemento)).sendKeys(complemento);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Entao("^clicar em salvar e confirmar box endereco$")
	public void salvarEndereco() {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(xpathSalvarEndereco)).click();
			WebElement btnEditar = driver.findElement(By.xpath(xpathEditarEndereco));
			Assert.assertNotNull(btnEditar);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^o nome do socio \"([^\"]*)\"$")
	public void preencherSocio(String nomeSocio) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.name(nomeCampoNomeSocio)).sendKeys(nomeSocio);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^e o cpf \"([^\"]*)\"$")
	public void preecherCPF(String cpf) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.name(nomeCampoCpf)).sendKeys(cpf);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^a porcentagem \"([^\"]*)\"$")
	public void preencherPorcentagem(String porcentagem) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.name(nomeCampoParticipacao)).sendKeys(porcentagem);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^a data de nascimento\"([^\"]*)\"$")
	public void preencherDataNascimento(String dtNascimento) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.name(nomeCampoDataNascimento)).sendKeys(dtNascimento);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^o telefone \"([^\"]*)\"$")
	public void preecherTelefoneSocio(String telefone) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(xpathCampoTelefoneSocio)).sendKeys(telefone);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^o email\"([^\"]*)\"$")
	public void preencherEmail(String email) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.name(nomeCampoEmail)).sendKeys(email);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Entao("^clicar em salvar e confirmar box socio$")
	public void salvarBoxSocio() {
		try {
			Thread.sleep(1000);
			// ESPERANDO
			driver.findElement(By.xpath(xpathBtnSalvaSocio)).click();
			WebElement btnEditar = driver.findElement(By.xpath(xpathEditaSocio));
			Assert.assertNotNull(btnEditar);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^o cnae \"([^\"]*)\"$")
	public void preencherCNAE(String cnae) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.id(idCampoCNAE)).sendKeys(cnae);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^o faturamento mensal \"([^\"]*)\"$")
	public void preecherFaturamentoMensal(String fatMensal) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.id(idCampoFaturamento)).sendKeys(fatMensal);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^a previsao de venda \"([^\"]*)\"$")
	public void preencherPrevisaoVenda(String ItemPrevVenda) throws Throwable {
		try {
			Thread.sleep(1000);
			WebElement select = driver.findElement(By.id(idFormPrevisaoVenda));
			new org.openqa.selenium.support.ui.Select(select).selectByIndex(Integer.parseInt(ItemPrevVenda));

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Entao("^confirmar habilitacao menu de planos$")
	public void confirmarCampoPlanos() {
		try {

<<<<<<< HEAD
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement campoPlanos = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathClassePlanos)));
			Assert.assertNotNull(campoPlanos);
=======
>>>>>>> b08b582038a909b9bad37d1ae4ac7fa4e1c07f25

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^adicionar solução POS com fio \"([^\"]*)\"$")
	public void addPosComFio(String qtdComFio) {
		try {
<<<<<<< HEAD
			driver.findElement(By.xpath(xpathQtdPOSComFio)).clear();
=======
			Thread.sleep(1000);
>>>>>>> b08b582038a909b9bad37d1ae4ac7fa4e1c07f25
			driver.findElement(By.xpath(xpathQtdPOSComFio)).sendKeys(qtdComFio);
			driver.findElement(By.xpath(xpathAddPOSComFio)).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Entao("^confirmar inclusao POS com fio no carrinho \"([^\"]*)\"$")
<<<<<<< HEAD
	public void confirmar_inclusao_POS_com_fio_no_carrinho(String qtdPOS) {

		try {
			WebElement campoQtdPOS = driver.findElement((By.xpath(xpathCarrinhoPOScomFio)));
			Assert.assertNotNull(campoQtdPOS);

		} catch (Exception e) {
			fail();
			driver.close();
		}

=======
	public void confirmar_inclusao_POS_com_fio_no_carrinho(String qtdPOS) throws Throwable {
		try {
			Thread.sleep(1000);
			WebElement campoQtdPOS = driver.findElement((By.xpath(xpathCarrinhoPOScomFio)));
			Assert.assertEquals(campoQtdPOS.getText(), qtdPOS);
			throw new PendingException();
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
>>>>>>> b08b582038a909b9bad37d1ae4ac7fa4e1c07f25
	}

	@Dado("^adicionar solução POS sem fio	\"([^\"]*)\"$")
	public void addPosSemFio(String qtdSemFio) {
		try {
<<<<<<< HEAD
			driver.findElement(By.xpath(xpathQtdPOSSemFio)).clear();
=======
			Thread.sleep(1000);
>>>>>>> b08b582038a909b9bad37d1ae4ac7fa4e1c07f25
			driver.findElement(By.xpath(xpathQtdPOSSemFio)).sendKeys(qtdSemFio);
			driver.findElement(By.xpath(xpathAddPOSemFio)).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Entao("^confirmar inclusao POS sem fio no carrinho \"([^\"]*)\"$")
<<<<<<< HEAD
	public void confirmar_inclusao_POS_sem_fio_no_carrinho(String qtdPOS) {

		try {
			WebElement campoQtdPOS = driver.findElement((By.xpath(xpathCarrinhoPOSsemFio)));
			Assert.assertNotNull(campoQtdPOS);

		} catch (Exception e) {
			fail();
			driver.close();
		}
=======
	public void confirmar_inclusao_POS_sem_fio_no_carrinho(String qtdPOS) throws Throwable {
		
		try {
			Thread.sleep(1000);
			WebElement campoQtdPOS = driver.findElement((By.xpath(xpathCarrinhoPOSsemFio)));
			Assert.assertEquals(campoQtdPOS.getText(), qtdPOS);
			throw new PendingException();
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}	
>>>>>>> b08b582038a909b9bad37d1ae4ac7fa4e1c07f25
	}

	@Dado("^adicionar solução POS mobile	\"([^\"]*)\"$")
	public void addPosMobile(String qtdPosMobile) {
		try {
<<<<<<< HEAD
			driver.findElement(By.xpath(xpathQtdPOSMobile)).clear();
=======
			Thread.sleep(1000);
>>>>>>> b08b582038a909b9bad37d1ae4ac7fa4e1c07f25
			driver.findElement(By.xpath(xpathQtdPOSMobile)).sendKeys(qtdPosMobile);
			driver.findElement(By.xpath(xpathAddPOSMobile)).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Entao("^confirmar inclusao POS mobile no carrinho \"([^\"]*)\"$")
	public void confirmar_inclusao_POS_mobile_no_carrinho(String qtdPOS) throws Throwable {
<<<<<<< HEAD

		try {
			WebElement campoQtdPOS = driver.findElement((By.xpath(xpathCarrinhoPOSMobile)));
			Assert.assertNotNull(campoQtdPOS);

		} catch (Exception e) {
			fail();
			driver.close();
		}

=======
		try {
			Thread.sleep(1000);
			WebElement campoQtdPOS = driver.findElement((By.xpath(xpathCarrinhoPOSMobile)));
			Assert.assertEquals(campoQtdPOS.getText(), qtdPOS);
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
>>>>>>> b08b582038a909b9bad37d1ae4ac7fa4e1c07f25
	}

	@Dado("^a bandeira \"([^\"]*)\"$")
	public void preencherBandeira(String itemBandeira) {
		try {
<<<<<<< HEAD
			// JMJR
			Thread.sleep(2000);
			WebElement select = driver.findElement(By.xpath(xpathSelectBandeira));
			new org.openqa.selenium.support.ui.Select(select).selectByVisibleText(itemBandeira);
			// JMJR
			System.out.println(itemBandeira);
			// new
			// org.openqa.selenium.support.ui.Select(select).selectByIndex(Integer.parseInt(itemBandeira));

=======
			Thread.sleep(1000);
			WebElement select = driver.findElement(By.xpath(xpathSelectBandeira));
			new org.openqa.selenium.support.ui.Select(select).selectByIndex(Integer.parseInt(itemBandeira));
>>>>>>> b08b582038a909b9bad37d1ae4ac7fa4e1c07f25
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^o banco \"([^\"]*)\"$")
	public void preencherBanco(String banco) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.id(idCampoBanco)).sendKeys(banco);
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^a agencia \"([^\"]*)\"$")
	public void preencherAgencia(String agencia) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.id(idCampoAgencia)).sendKeys(agencia);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^a conta \"([^\"]*)\"$")
	public void preencherConta(String conta) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.name(nomeCampoConta)).sendKeys(conta);
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Entao("^clicar no botao para adicionar$")
	public void clicalBotaoAdcionar() {
		try {
<<<<<<< HEAD
			driver.findElement(By.xpath(xpathAddDomicilioBanc)).click();
			;
			// JMJR
			Thread.sleep(2000);

=======
			Thread.sleep(1000);
			driver.findElement(By.xpath(xpathAddDomicilioBanc)).click();
>>>>>>> b08b582038a909b9bad37d1ae4ac7fa4e1c07f25
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^email do agente credenciador \"([^\"]*)\"$")
	public void preencherEmailCredenciador(String emailCred) {
		try {
			driver.findElement(By.xpath(xpathCampoEmailCred)).sendKeys(emailCred);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^nome da pessoa que recebera o esquipamento \"([^\"]*)\"$")
	public void preencherReceptorEquipamento(String receptor) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(xpathReceptor)).sendKeys(receptor);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Dado("^as observacoes \"([^\"]*)\"$")
	public void preencherObservacoes(String observacoes) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(xpathObervacoes)).sendKeys(observacoes);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

	@Entao("^enviar proposta$")
	public void enviarProposta() {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(xpathBtnEnviarProposta)).click();
			// CONFIRMANDO ENVIO
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathAlerta)));
			
			Assert.assertThat(alert.getText(), CoreMatchers.containsString(textoMsgSucesso));

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());fail();driver.close();
		}
	}

}
