# language: pt
@CRED01
Funcionalidade: Acessar a aplicação e realizar o cadastro de uma nova proposta com sucesso

  Cenario: Acessar o browser e preencher a url do sistema e acessar o sistema
    Dado o browser "chrome" inserir a url "http://credenciamentowebdsv.tripag.com.br" da aplicação
    Entao confirmada a abertura da pagina atraves do titulo "Credenciamento WEB"

  Esquema do Cenario: Inserir um cnpj válido e não cadastrado no sistema e escolher a opção de um novo cadastro
    Dado preencher cnpj<cnpj>
    E clicar no botão lupa
    E confirmar a inserção de um novo cadastro
    Entao verificar se a tela está aberta pelo campo razao social

    Exemplos: 
      | cnpj             |
      | "59165644000182" |

  Esquema do Cenario: Preencher todos os campos da aba Empresa e salvar
    Dado a razão Social:<Razão Social>
    E o Nome fantasia:<Nome fantasia>
    E a Data de fundação:<Data de fundação>
    E preecher o Email:<EmailEmpresa>
    E o Telefone:<Telefone>
    Entao Verificar se a tela exibe a box com os dados da empresa salvos

    Exemplos: 
      | Razão Social          | Nome fantasia | Data de fundação | EmailEmpresa          | Telefone     |
      | "CEDRO QA TESTE AUTO" | "JADMJR QA"   | "12/06/1990"     | "jadmjr@teste.com.br" | "3492881747" |

  Esquema do Cenario: Preencher todos os campos da aba endereco e salvar
    Dado o cep<cep>
    E o numero <numero>
    E o complemento <complemento>
    Entao clicar em salvar e confirmar box endereco

    Exemplos: 
      | cep        | numero | complemento     |
      | "38408714" | "768"  | "Casa Vermelha" |

  Esquema do Cenario: Preencher todos os campos da aba socio PF e salvar
    Dado o nome do socio <nomeSocio>
    E e o cpf <cpf>
    E a porcentagem <porcentagem>
    E a data de nascimento<dtNascimento>
    E o telefone <telefoneSocio>
    E o email<email>
    Entao clicar em salvar e confirmar box socio

    Exemplos: 
      | nomeSocio       | cpf           | porcentagem | dtNascimento | telefoneSocio | email                 |
      | "José Saramago" | "10653063695" | "100"       | "12/06/1990" | "3432177247"  | "jose.sara@gmail.com" |
