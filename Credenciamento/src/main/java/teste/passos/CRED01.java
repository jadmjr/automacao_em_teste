package teste.passos;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuracao.Config;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class CRED01 extends Config {

	// Acessar o browser e preencher a url do sistema e acessar o sistema

	@Dado("^o browser \"(.*?)\" inserir a url \"([^\"]*)\" da aplicação$")
	public void acessarAplicacao(String browser, String url) throws Exception {
		try {
			// JMJR
			System.out.println("Acessar aplicacao");

			if (browser.equals("chrome")) {

				// Configurando opções do navegador
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				System.setProperty("webdriver.chrome.driver", pathChromeServer);

				// Inicializando Nav.
				driver = new ChromeDriver(options);
				driver.get(url);
				driver.manage().timeouts().setScriptTimeout(90, TimeUnit.SECONDS);
				// driver.findElement(By.name("q")).sendKeys("Jadson Uberaba");
				// System.out.println("jadson uberaba");
			}
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());
			fail();driver.close();
		}
	}

	@Entao("^confirmada a abertura da pagina atraves do titulo \"([^\"]*)\"$")
	public void acesso(String texto) throws Exception {
		try {
			// JMJR
			System.out.println("acesso");

			// Testando Acesso a Página pelo título
			Assert.assertEquals(driver.getTitle(), texto);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());
			fail();driver.close();
		} catch (AssertionError e) {
			System.out.println("Erro - " + e.getMessage());
			fail();driver.close();
		}
	}

	// Inserir um cnpj válido e não cadastrado no sistema e escolher a opção de um
	// novo cadastro

	@Dado("^preencher cnpj\"([^\"]*)\"$")
	public void InserirCPNJ(String cnpj) {
		try {
			// JMJR
			System.out.println("inserir CNPJ");

			// Esperando carregar input
			WebElement campoCNPJ = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.id("inlineFormInputGroup")));

			campoCNPJ.sendKeys(cnpj);

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());
			fail();driver.close();
		}
	}

	@Dado("^clicar no botão lupa$")
	public void clicarLupa() {
		try {
			// JMJR
			System.out.println("Clicar na lupa");
			// Clique lupa
			driver.findElement(By.id(camBtnLupa)).click();

		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());
			fail();driver.close();
		}
	}

	@E("confirmar a inserção de um novo cadastro$")
	public void confirmarNovoCadastro() throws Exception{
		try {
			WebElement btnConfirmar = (new WebDriverWait(driver,2)).until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@id='btAbreProposta'])[2]")));
			btnConfirmar.click();

		} catch (Exception e) {
			System.out.println("Erro - será aqui" + e.getMessage());
			driver.close();
		}
	}

	@Entao("^verificar se a tela está aberta pelo campo razao social$")
	public void AbrirTelaNovoCadastro() {
		try {
			// JMJR
			System.out.println("abrir tela novo cadastro");
			// JMJR ESPERA IMPLICIDA
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			// ESPERANDO
			WebElement campoRazaoSocial = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.name("razaoSocial")));

			Assert.assertNotNull(campoRazaoSocial);
			System.out.println("afirmou o não nulo");
		} catch (Exception e) {
			System.out.println("Erro - " + e.getMessage());
			fail();driver.close();
		}
	}

	@Dado("^a razão Social:\"([^\"]*)\"$")
	public void PrecherRazaoSocial(String razaoSocial) {
		try {
			// JMJR
			System.out.println("PrecherRazaoSocial");

			// ESPERANDO
			WebElement campoRazaoSocial = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.name("razaoSocial")));

			campoRazaoSocial.sendKeys(razaoSocial);
		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^o Nome fantasia:\"([^\"]*)\"$")
	public void PrecherNomeFantasia(String nomeFantasia) {
		try {
			// JMJR
			System.out.println("PrecherNomeFantasia");

			// ESPERANDO
			WebElement campoNomeFantasia = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.name("nomeFantasia")));

			campoNomeFantasia.sendKeys(nomeFantasia);
		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^a Data de fundação:\"([^\"]*)\"$")
	public void PrecherDtFundacao(String dtfundacao) {
		try {
			// JMJR
			System.out.println("PrecherDtFundacao");

			// ESPERANDO
			WebElement campoDtFundacao = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.name("dataFundacao")));

			campoDtFundacao.sendKeys(dtfundacao);
		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^preecher o Email:\"([^\"]*)\"$")
	public void PrecherEmail(String email) {
		try {
			// JMJR
			System.out.println("PrecherEmail");

			// ESPERANDO
			WebElement campoEmail = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.name("emaildadoscadastrais")));

			campoEmail.sendKeys(email);
		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^o Telefone:\"([^\"]*)\"$")
	public void PrecherTelefone(String telefone) {
		try {
			// JMJR
			System.out.println("PrecherTelefone");

			// ESPERANDO
			WebElement campoTelefone = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.name("telefone")));

			campoTelefone.sendKeys(telefone);
		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Entao("^Verificar se a tela exibe a box com os dados da empresa salvos$")
	public void ValidarBoxEmpresa() {
		try {
			// JMJR
			System.out.println("ValidarBoxEmpresa");

			// ESPERANDO
			WebElement btnSalvar = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[2]/button")));

			btnSalvar.click();

			WebElement btnEditar = driver.findElement(By.xpath("//*[@id=\"formInfoCadastrais\"]/div[2]/div/button"));
			Assert.assertNotNull(btnEditar);
			// JMJR
			System.out.println("CLICOU EM SALVAR");
		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^o cep\"([^\"]*)\"$")
	public void preencherCep(String cep) {
		try {
			// JMJR
			System.out.println("preencherCep");

			// ESPERANDO
			driver.findElement(By.id("cep")).sendKeys(cep);
		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^o numero \"([^\"]*)\"$")
	public void preencherNumero(String numero) throws Throwable {
		try {
			// JMJR
			System.out.println("preencherNumero");
			// JMJR ESPERA IMPLICIDA PARA ESPERAR O WEBSERVICE
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			// ESPERANDO
			WebElement campoEndereco = driver.findElement(By.id("endereco"));
			campoEndereco.sendKeys(campoEndereco.getText() + ", " + numero);

		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^o complemento \"([^\"]*)\"$")
	public void preencherComplemento(String complemento) {
		try {
			// JMJR
			System.out.println("preencherComplemento");

			// ESPERANDO
			driver.findElement(By.id("complemento")).sendKeys(complemento);

		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Entao("^clicar em salvar e confirmar box endereco$")
	public void salvarEndereco() {
		try {
			// JMJR
			System.out.println("salvarEndereco");

			// ESPERANDO
			driver.findElement(
					By.xpath("//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[2]/button"))
					.click();
			WebElement btnEditar = driver.findElement(
					By.xpath("//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[1]/div[3]/div/div[2]/div/button"));
			Assert.assertNotNull(btnEditar);

		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^o nome do socio \"([^\"]*)\"$")
	public void preencherSocio(String nomeSocio) {
		try {
			// JMJR
			System.out.println("preencherSocio");

			driver.findElement(By.name("nome")).sendKeys(nomeSocio);

		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^e o cpf \"([^\"]*)\"$")
	public void preecherCPF(String cpf) {
		try {
			// JMJR
			System.out.println("preecherCPF");

			driver.findElement(By.name("cpf")).sendKeys(cpf);

		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^a porcentagem \"([^\"]*)\"$")
	public void preencherPorcentagem(String porcentagem) {
		try {
			// JMJR
			System.out.println("preencherPorcentagem");

			driver.findElement(By.name("participacao")).sendKeys(porcentagem);

		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^a data de nascimento\"([^\"]*)\"$")
	public void preencherDataNascimento(String dtNascimento) {
		try {
			// JMJR
			System.out.println("preencherDataNascimento");

			driver.findElement(By.name("dataNascimento")).sendKeys(dtNascimento);

		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^o telefone \"([^\"]*)\"$")
	public void preecherTelefone(String telefone) {
		try {
			// JMJR
			System.out.println("preecherTelefone");
			System.out.println("telefoneSocio: " + telefone);
			driver.findElement(By.xpath(
					"//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[2]/div[3]/div/div/div[1]/form/div[2]/div[6]/div/input"))
					.sendKeys(telefone);

		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Dado("^o email\"([^\"]*)\"$")
	public void preencherEmail(String email) {
		try {
			// JMJR
			System.out.println("preencherEmail");

			driver.findElement(By.name("email")).sendKeys(email);

		} catch (Exception e) {
			fail();driver.close();
		}
	}

	@Entao("^clicar em salvar e confirmar box socio$")
	public void salvarBoxSocio() {
		try {
			// JMJR
			System.out.println("salvarBoxSocio");

			// ESPERANDO
			driver.findElement(
					By.xpath("//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/button"))
					.click();
			WebElement btnEditar = driver.findElement(
					By.xpath("//*[@id=\"CorpoProposta\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/button"));
			Assert.assertNotNull(btnEditar);

		} catch (Exception e) {
			fail();driver.close();
		}
	}

}
