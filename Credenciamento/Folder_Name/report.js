$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("caracteristicas/CRED01.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Acessar a aplicação e realizar o cadastro de uma nova proposta com sucesso",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@CRED01"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Acessar o browser e preencher a url do sistema e acessar o sistema",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;acessar-o-browser-e-preencher-a-url-do-sistema-e-acessar-o-sistema",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 6,
  "name": "o browser \"chrome\" inserir a url \"http://credenciamentowebdsv.tripag.com.br\" da aplicação",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "confirmada a abertura da pagina atraves do titulo \"Credenciamento WEB\"",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 11
    },
    {
      "val": "http://credenciamentowebdsv.tripag.com.br",
      "offset": 34
    }
  ],
  "location": "CRED01.acessarAplicacao(String,String)"
});
formatter.result({
  "duration": 5918654500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Credenciamento WEB",
      "offset": 51
    }
  ],
  "location": "CRED01.acesso(String)"
});
formatter.result({
  "duration": 24477800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Inserir um cnpj válido e não cadastrado no sistema e escolher a opção de um novo cadastro",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;inserir-um-cnpj-válido-e-não-cadastrado-no-sistema-e-escolher-a-opção-de-um-novo-cadastro",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 10,
  "name": "preencher cnpj\u003ccnpj\u003e",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "clicar no botão lupa",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "confirmar a inserção de um novo cadastro",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "verificar se a tela está aberta pelo campo razao social",
  "keyword": "Entao "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;inserir-um-cnpj-válido-e-não-cadastrado-no-sistema-e-escolher-a-opção-de-um-novo-cadastro;",
  "rows": [
    {
      "cells": [
        "cnpj"
      ],
      "line": 16,
      "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;inserir-um-cnpj-válido-e-não-cadastrado-no-sistema-e-escolher-a-opção-de-um-novo-cadastro;;1"
    },
    {
      "cells": [
        "\"14691178000130\""
      ],
      "line": 17,
      "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;inserir-um-cnpj-válido-e-não-cadastrado-no-sistema-e-escolher-a-opção-de-um-novo-cadastro;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 17,
  "name": "Inserir um cnpj válido e não cadastrado no sistema e escolher a opção de um novo cadastro",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;inserir-um-cnpj-válido-e-não-cadastrado-no-sistema-e-escolher-a-opção-de-um-novo-cadastro;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 2,
      "name": "@CRED01"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "preencher cnpj\"14691178000130\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "clicar no botão lupa",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "confirmar a inserção de um novo cadastro",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "verificar se a tela está aberta pelo campo razao social",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "14691178000130",
      "offset": 15
    }
  ],
  "location": "CRED01.InserirCPNJ(String)"
});
formatter.result({
  "duration": 950056800,
  "status": "passed"
});
formatter.match({
  "location": "CRED01.clicarLupa()"
});
formatter.result({
  "duration": 147334800,
  "status": "passed"
});
formatter.match({
  "location": "CRED01.confirmarNovoCadastro()"
});
formatter.result({
  "duration": 4520620700,
  "status": "passed"
});
formatter.match({
  "location": "CRED01.AbrirTelaNovoCadastro()"
});
formatter.result({
  "duration": 38872800,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat teste.passos.CRED01.AbrirTelaNovoCadastro(CRED01.java:133)\r\n\tat ✽.Entao verificar se a tela está aberta pelo campo razao social(caracteristicas/CRED01.feature:13)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Preencher todos os campos da aba Empresa e salvar",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-empresa-e-salvar",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 20,
  "name": "a razão Social:\u003cRazão Social\u003e",
  "keyword": "Dado "
});
formatter.step({
  "line": 21,
  "name": "o Nome fantasia:\u003cNome fantasia\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "a Data de fundação:\u003cData de fundação\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "preecher o Email:\u003cEmailEmpresa\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "o Telefone:\u003cTelefone\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "Verificar se a tela exibe a box com os dados da empresa salvos",
  "keyword": "Entao "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-empresa-e-salvar;",
  "rows": [
    {
      "cells": [
        "Razão Social",
        "Nome fantasia",
        "Data de fundação",
        "EmailEmpresa",
        "Telefone"
      ],
      "line": 28,
      "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-empresa-e-salvar;;1"
    },
    {
      "cells": [
        "\"CEDRO QA TESTE AUTO\"",
        "\"JADMJR QA\"",
        "\"12/06/1990\"",
        "\"jadmjr@teste.com.br\"",
        "\"3492881747\""
      ],
      "line": 29,
      "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-empresa-e-salvar;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 29,
  "name": "Preencher todos os campos da aba Empresa e salvar",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-empresa-e-salvar;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 2,
      "name": "@CRED01"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "a razão Social:\"CEDRO QA TESTE AUTO\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 21,
  "name": "o Nome fantasia:\"JADMJR QA\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "a Data de fundação:\"12/06/1990\"",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "preecher o Email:\"jadmjr@teste.com.br\"",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "o Telefone:\"3492881747\"",
  "matchedColumns": [
    4
  ],
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "Verificar se a tela exibe a box com os dados da empresa salvos",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "CEDRO QA TESTE AUTO",
      "offset": 16
    }
  ],
  "location": "CRED01.PrecherRazaoSocial(String)"
});
formatter.result({
  "duration": 8199500,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat teste.passos.CRED01.PrecherRazaoSocial(CRED01.java:149)\r\n\tat ✽.Dado a razão Social:\"CEDRO QA TESTE AUTO\"(caracteristicas/CRED01.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "JADMJR QA",
      "offset": 17
    }
  ],
  "location": "CRED01.PrecherNomeFantasia(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "12/06/1990",
      "offset": 20
    }
  ],
  "location": "CRED01.PrecherDtFundacao(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "jadmjr@teste.com.br",
      "offset": 18
    }
  ],
  "location": "CRED01.PrecherEmail(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3492881747",
      "offset": 12
    }
  ],
  "location": "CRED01.PrecherTelefone(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CRED01.ValidarBoxEmpresa()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 31,
  "name": "Preencher todos os campos da aba endereco e salvar",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-endereco-e-salvar",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 32,
  "name": "o cep\u003ccep\u003e",
  "keyword": "Dado "
});
formatter.step({
  "line": 33,
  "name": "o numero \u003cnumero\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 34,
  "name": "o complemento \u003ccomplemento\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 35,
  "name": "clicar em salvar e confirmar box endereco",
  "keyword": "Entao "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-endereco-e-salvar;",
  "rows": [
    {
      "cells": [
        "cep",
        "numero",
        "complemento"
      ],
      "line": 38,
      "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-endereco-e-salvar;;1"
    },
    {
      "cells": [
        "\"38408714\"",
        "\"768\"",
        "\"Casa Vermelha\""
      ],
      "line": 39,
      "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-endereco-e-salvar;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 39,
  "name": "Preencher todos os campos da aba endereco e salvar",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-endereco-e-salvar;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 2,
      "name": "@CRED01"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "o cep\"38408714\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 33,
  "name": "o numero \"768\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 34,
  "name": "o complemento \"Casa Vermelha\"",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 35,
  "name": "clicar em salvar e confirmar box endereco",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "38408714",
      "offset": 6
    }
  ],
  "location": "CRED01.preencherCep(String)"
});
formatter.result({
  "duration": 4986300,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat teste.passos.CRED01.preencherCep(CRED01.java:247)\r\n\tat ✽.Dado o cep\"38408714\"(caracteristicas/CRED01.feature:32)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "768",
      "offset": 10
    }
  ],
  "location": "CRED01.preencherNumero(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Casa Vermelha",
      "offset": 15
    }
  ],
  "location": "CRED01.preencherComplemento(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CRED01.salvarEndereco()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 41,
  "name": "Preencher todos os campos da aba socio PF e salvar",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-socio-pf-e-salvar",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 42,
  "name": "o nome do socio \u003cnomeSocio\u003e",
  "keyword": "Dado "
});
formatter.step({
  "line": 43,
  "name": "e o cpf \u003ccpf\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 44,
  "name": "a porcentagem \u003cporcentagem\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 45,
  "name": "a data de nascimento\u003cdtNascimento\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 46,
  "name": "o telefone \u003ctelefoneSocio\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 47,
  "name": "o email\u003cemail\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 48,
  "name": "clicar em salvar e confirmar box socio",
  "keyword": "Entao "
});
formatter.examples({
  "line": 50,
  "name": "",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-socio-pf-e-salvar;",
  "rows": [
    {
      "cells": [
        "nomeSocio",
        "cpf",
        "porcentagem",
        "dtNascimento",
        "telefoneSocio",
        "email"
      ],
      "line": 51,
      "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-socio-pf-e-salvar;;1"
    },
    {
      "cells": [
        "\"José Saramago\"",
        "\"10653063695\"",
        "\"100\"",
        "\"12/06/1990\"",
        "\"3432177247\"",
        "\"jose.sara@gmail.com\""
      ],
      "line": 52,
      "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-socio-pf-e-salvar;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 52,
  "name": "Preencher todos os campos da aba socio PF e salvar",
  "description": "",
  "id": "acessar-a-aplicação-e-realizar-o-cadastro-de-uma-nova-proposta-com-sucesso;preencher-todos-os-campos-da-aba-socio-pf-e-salvar;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 2,
      "name": "@CRED01"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "o nome do socio \"José Saramago\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 43,
  "name": "e o cpf \"10653063695\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 44,
  "name": "a porcentagem \"100\"",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 45,
  "name": "a data de nascimento\"12/06/1990\"",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 46,
  "name": "o telefone \"3432177247\"",
  "matchedColumns": [
    4
  ],
  "keyword": "E "
});
formatter.step({
  "line": 47,
  "name": "o email\"jose.sara@gmail.com\"",
  "matchedColumns": [
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 48,
  "name": "clicar em salvar e confirmar box socio",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "José Saramago",
      "offset": 17
    }
  ],
  "location": "CRED01.preencherSocio(String)"
});
formatter.result({
  "duration": 9579700,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat teste.passos.CRED01.preencherSocio(CRED01.java:309)\r\n\tat ✽.Dado o nome do socio \"José Saramago\"(caracteristicas/CRED01.feature:42)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "10653063695",
      "offset": 9
    }
  ],
  "location": "CRED01.preecherCPF(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 15
    }
  ],
  "location": "CRED01.preencherPorcentagem(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "12/06/1990",
      "offset": 21
    }
  ],
  "location": "CRED01.preencherDataNascimento(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3432177247",
      "offset": 12
    }
  ],
  "location": "CRED01.preecherTelefone(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "jose.sara@gmail.com",
      "offset": 8
    }
  ],
  "location": "CRED01.preencherEmail(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CRED01.salvarBoxSocio()"
});
formatter.result({
  "status": "skipped"
});
});