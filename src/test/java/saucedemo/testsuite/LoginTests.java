package saucedemo.testsuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes automatizados da funcionalidade de Login")
public class LoginTests {
    @DisplayName("Login de usuário com dados válidos")
    @Test()
    public void testLoginDeUsuarioComDadosValidos(){
        // Inicializar o browser
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        // Navegar até ao site
        navegador.get("https://saucedemo.com");

        // Efectuar e confirmar o login
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();

        String textoValidacao = navegador.findElement(By.className("app_logo")).getText();

        Assertions.assertEquals("Swag Labs", textoValidacao);

        // Fechar o browser
        navegador.close();
    }
}