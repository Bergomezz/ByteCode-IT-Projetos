PROJETO DE AUTOMAÇÃO SAUCEDEMO
ENTREGA: 02/02/2022
URL: https://www.saucedemo.com/
Funcionalidade: Tela de login
Objetivo: Testar 15 diferentes casos de testes, incluindo casos de sucesso e falha
Tecnologias a serem utilizadas:
Java JDK 11
JUnit
Cucumber
Selenium webdriver
Chrome driver.exe
Passo a passo de como deve ser entregue:
1. Crie um repositório no github com o nome “ByteCode-IT-Projetos”
2. Suba o que você desenvolveu para o repositório criado
3. Envie um e-mail para “Coordenador1@escolabytecode.com.br” avisando que concluiu
Exemplos de casos:
Caso de testes 1 | Sucesso
Dado que o usuário está na tela de login
Quando preenche o username com “standard_user” e password com “secret_sauce”
E clica no botão de login
Então deve ter acesso
Caso de testes 2 | Falha
Dado que o usuário está na tela de login
Quando preenche o username com “” e password com “secret_sauce”
E clica no botão de login
Então deve ter acesso
