#language: pt


  Funcionalidade: Testando Login

    Cenario: Testando logins corretos e incorretos

      Dado que o usuario esta na pagina de login
      Quando preenche o username com “standard_user” e password com “secret_sauce” e clicar no botao de login
      Entao deve ter acesso


      Esquema do Cenario:
        Dado que o usuario esta na pagina de login
        Quando preenche o username com <usuario> e password com <pass> e clicar no botao de login
        Entao deve receber a <resposta>
        Exemplos:
        |usuario|pass|resposta|
        | ""     |"" |""      |
