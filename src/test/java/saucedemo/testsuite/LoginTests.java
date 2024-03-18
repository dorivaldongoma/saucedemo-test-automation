package saucedemo.testsuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductsPage;

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
        // Navegar até ao site
        LoginPage loginPage = new LoginPage(navegador);
        loginPage.goToLoginPage();

        // Efectuar o login
        loginPage.login("standard_user", "secret_sauce");

        // Confirmar o login
        ProductsPage productsPage = new ProductsPage(navegador);

        String validationText = productsPage.getValidationText();
        Assertions.assertEquals("Swag Labs", validationText);
    }

    @AfterEach
    public void tearDown(){
        // Fechar o browser
        navegador.close();
    }
}