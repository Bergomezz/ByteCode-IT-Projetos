package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;


public class LoginTest {

    WebDriver driver;

    private static String URL_LOGIN_PAGE = "https://www.saucedemo.com/";

    private void login(String user, String senha) {
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(senha);
        driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
    }

    private void assertiva(String casoTeste, String resposta){
        if (Objects.equals(casoTeste, "valido")) {
            Assert.assertEquals(resposta, driver.getCurrentUrl());
        } else {
            Assert.assertTrue(driver.getPageSource().contains(resposta));
        }
    }

    @Before
    public void browser() {
        System.setProperty("webdriver.chrome.driver","D:\\Projetos\\ByteCode\\ByteCode-IT-Projetos\\Java\\webdrive\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void fecharAba() {
        driver.quit();
    }

    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {

        driver.get(URL_LOGIN_PAGE);

    }

    @Quando("preenche o username com {string} e password com {string} e clicar no botao de login")
    public void preenche_o_username_com_e_password_com_e_clicar_no_botao_de_login(String usuario, String senha) {
        login(usuario, senha);
    }

    @Entao("quando o {string} ocorrer deve receber a {string}")
    public void quando_o_caso_teste_ocorrer_deve_receber_a(String casoTeste, String resposta) {
        assertiva(casoTeste, resposta);
    }


}
