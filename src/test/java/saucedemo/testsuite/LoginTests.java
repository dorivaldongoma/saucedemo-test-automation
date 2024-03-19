package saucedemo.testsuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import saucedemo.pages.LoginPage;

@DisplayName("Testes automatizados da funcionalidade de Login")
public class LoginTests {
    private WebDriver navegador;

    @BeforeEach
    public void setup(){
        // Inicializar o browser
        WebDriverManager.chromedriver().setup();
        navegador = new ChromeDriver();
    }

    @DisplayName("Login de usuário com dados válidos")
    @Test()
    public void testLoginDeUsuarioComDadosValidos(){
        // Navegar até ao site, efectuar login e validar
        String validationText = new LoginPage(navegador)
                .goToLoginPage()
                .login("standard_user", "secret_sauce")
                .getValidationText();

        Assertions.assertEquals("Swag Labs", validationText);
    }

    @AfterEach
    public void tearDown(){
        // Fechar o browser
        navegador.close();
    }
}