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
      | "30917141000134" |

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

  Esquema do Cenario: Preencher Faturamento
    Dado o cnae <cnae>
    E o faturamento mensal <fatMensal>
    E a previsao de venda <ItemPrevVenda>
    Entao confirmar habilitacao menu de planos

    Exemplos: 
      | cnae                                                                         | fatMensal | ItemPrevVenda |
      | "5611202 - Bares e outros estabelecimentos especializados em servir bebidas" | "10000"   | "1"           |

  Esquema do Cenario: Escolher Solução
    Dado adicionar solução POS com fio <qtdComFio>
    Entao confirmar inclusao POS com fio no carrinho <qtdComFio>
    E adicionar solução POS sem fio	<qtdSemFio>
    Entao confirmar inclusao POS sem fio no carrinho <qtdSemFio>
    E adicionar solução POS mobile	<qtdMobile>
    Entao confirmar inclusao POS mobile no carrinho <qtdMobile>

    Exemplos: 
      | qtdComFio | qtdSemFio | qtdMobile |
      | "10"      | "2"      | "5"       |

  Esquema do Cenario: Preencher dados bancarios
    Dado a bandeira <ItemBandeira>
    E o banco <banco>
    E a agencia <agencia>
    E a conta <conta>
    Entao clicar no botao para adicionar

    Exemplos: 
      | ItemBandeira | banco                           | agencia | conta    |
      | "0"          | "104 - CAIXA ECONOMICA FEDERAL" | "1065"  | "233939" |

  Esquema do Cenario: Preencher dados complementares
    Dado email do agente credenciador <emailCred>
    E nome da pessoa que recebera o esquipamento <nomeRec>
    E as observacoes <obervacoes>
    Entao enviar proposta

    Exemplos: 
      | emailCred          | nomeRec       | obervacoes |
      | "jadmjr@gmail.com" | "JOSE CUERVO" | "ROBO"     |
