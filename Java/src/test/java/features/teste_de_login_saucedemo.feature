#language: pt

Funcionalidade: Testando Login

  Esquema do Cenario:
    Dado que o usuario esta na pagina de login
    Quando preenche o username com <usuario> e password com <senha> e clicar no botao de login
    Entao quando o <casoTeste> ocorrer deve receber a <resposta>
    Exemplos:
      | casoTeste  | usuario                   | senha           | resposta                                                                    |
      | "valido"   | "standard_user"           | "secret_sauce" | "https://www.saucedemo.com/inventory.html"                                                                  |
      | "valido"   | "problem_user"            | "secret_sauce" | "https://www.saucedemo.com/inventory.html"                                                                  |
      | "valido"   | "performance_glitch_user" | "secret_sauce" | "https://www.saucedemo.com/inventory.html"                                                                  |
      | "invalido" | "locked_out_user"         | "secret_sauce" | "Epic sadface: Sorry, this user has been locked out."                       |
      | "invalido" | ""                        | ""             | "Epic sadface: Username is required"                                        |
      | "invalido" | ""                        | "secret_sauce" | "Epic sadface: Username is required"                                        |
      | "invalido" | "stand_user"              | ""             | "Epic sadface: Password is required"                                        |
      | "invalido" | "123456"                  | "secret_sauce" | "Epic sadface: Username and password do not match any user in this service" |
      | "invalido" | "stand_user"              | "123456"       | "Epic sadface: Username and password do not match any user in this service" |
      | "invalido" | "@asd#"                   | ""             | "Epic sadface: Password is required"                                        |
      | "invalido" | "@asd#"                   | "secret_sauce" | "Epic sadface: Username and password do not match any user in this service" |
      | "invalido" | "@asd#"                   | "123456"       | "Epic sadface: Username and password do not match any user in this service" |
      | "invalido" | "standard_user"           | "@#~"          | "Epic sadface: Username and password do not match any user in this service" |
      | "invalido" | "@#~"                     | "@#^"          | "Epic sadface: Username and password do not match any user in this service" |
      | "invalido" | "123456"                  | "123456"       | "Epic sadface: Username and password do not match any user in this service" |

