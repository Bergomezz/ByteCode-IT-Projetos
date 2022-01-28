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
import org.openqa.selenium.remote.Response;

public class LoginTest {

    WebDriver driver;

    @Before
    public void browser(){
        System.setProperty("webdriver.chrome.driver", "D:\\Projetos\\ByteCode\\ByteCode-IT-Projetos\\Java\\webdrive\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        driver.get("https://www.saucedemo.com/");
    }

    @Quando("preenche o username com “standard_user” e password com “secret_sauce” e clicar no botao de login")
    public void preenche_o_username_com_standard_user_e_password_com_secret_sauce_e_clicar_no_botao_de_login() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);

    }

    @Entao("deve ter acesso")
    public void deve_ter_acesso() {
        //Assert.assertEquals("Products", driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")));
    }

    @Quando("preenche o username com {string} e password com {string} e clicar no botao de login")
    public void preenche_o_username_com_e_password_com_e_clicar_no_botao_de_login(String usuario, String pass) {
        driver.findElement(By.id("user-name")).sendKeys(usuario);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
    }

    @Entao("deve receber a {string}")
    public void deve_receber_a(String resposta) {
        //Assert.assertEquals(resposta, driver.);
    }

}
